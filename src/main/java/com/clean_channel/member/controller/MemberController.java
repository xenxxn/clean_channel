package com.clean_channel.member.controller;

import com.clean_channel.member.data.dto.SignUpRequest;
import com.clean_channel.member.data.dto.SignUpResponse;
import com.clean_channel.member.data.entity.Member;
import com.clean_channel.member.service.MemberService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = "회원")
public class MemberController {

  private final MemberService memberService;

  @PostMapping("/sign-up")
  public ResponseEntity<SignUpResponse> signUp(@RequestBody SignUpRequest request) {
    return ResponseEntity.ok(SignUpResponse.from(memberService.signUp(request)));
  }
}
