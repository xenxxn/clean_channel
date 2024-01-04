package com.clean_channel.member.service;

import com.clean_channel.member.data.dto.SignUpRequest;
import com.clean_channel.member.data.entity.Member;
import com.clean_channel.member.data.type.Authority;
import com.clean_channel.member.repository.MemberRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
  private final MemberRepository memberRepository;

}
