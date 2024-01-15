package com.clean_channel.member.data.dto;

import com.clean_channel.member.data.entity.Member;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor
public class SignUpResponse {
  private String email;
  private String name;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime createDt;
  private String message;

  public static SignUpResponse from(Member member) {
    String memberName = member.getName();
    return SignUpResponse.builder()
        .email(member.getEmail())
        .name(member.getName())
        .createDt(member.getCreateDt())
        .message("환영합니다!" + memberName + "님, 클린채널에 회원가입이 완료되었습니다.")
        .build();
  }
}
