package com.zero_channel.member.data.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignUpRequest {
  @Email
  @NotBlank(message = "이메일은 필수 항목입니다.")
  private String email;

  @Size(min = 12, message = "비밀번호는 최소 12글자 이상 입력해주시길 바랍니다.")
  @NotBlank
  private String password;

  @Size(min = 12, message = "비밀번호는 최소 12글자 이상 입력해주시길 바랍니다.")
  @NotBlank
  private String rePassword;

  @NotBlank(message = "이름은 필수 항목입니다.")
  private String name;

  @NotBlank
  private String nickName;
}
