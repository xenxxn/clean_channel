package com.zero_channel.member.data.dto;

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
}
