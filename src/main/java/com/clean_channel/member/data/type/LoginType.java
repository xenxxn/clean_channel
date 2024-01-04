package com.clean_channel.member.data.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginType {

  GOOGLE("구글"),
  ZERO("제로");

  private final String description;
}
