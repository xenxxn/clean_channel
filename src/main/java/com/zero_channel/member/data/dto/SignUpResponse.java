package com.zero_channel.member.data.dto;

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
  private String message;
}
