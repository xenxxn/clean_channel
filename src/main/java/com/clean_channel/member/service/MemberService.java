package com.clean_channel.member.service;

import com.clean_channel.member.data.dto.SignUpRequest;
import com.clean_channel.member.data.entity.Member;
import com.clean_channel.member.data.type.Authority;
import com.clean_channel.member.data.type.LoginType;
import com.clean_channel.member.repository.MemberRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
  private final MemberRepository memberRepository;
  private final BCryptPasswordEncoder bCryptPasswordEncoder;
  @Transactional
  public Member signUp(SignUpRequest request) {
    if (memberRepository.existsByEmail(request.getEmail())){
      throw new RuntimeException("이미 존재하는 이메일입니다.");
    }
    if (!request.getPassword().equals(request.getCheckedPassword())) {
      throw new RuntimeException("비밀번호가 일치하지 않습니다.");
    }
    String encodePassword = bCryptPasswordEncoder.encode(request.getPassword());
    Member member = Member.builder()
        .email(request.getEmail())
        .password(encodePassword)
        .authority(Authority.USER)
        .name(request.getName())
        .nickName(request.getNickName())
        .isAuthenticatedEmail(false)
        .loginType(LoginType.CLEAN)
        .build();

    memberRepository.save(member);
    return member;
  }

}
