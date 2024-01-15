package com.clean_channel.member.data.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Authority {
  USER("회원"),
  ADMIN("관리자");
  private final String description;
}
