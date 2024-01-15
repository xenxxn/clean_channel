package com.clean_channel.member.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
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
  @Schema(description = "이메일", example = "zero@naver.com")
  private String email;

  @Size(min = 8, message = "비밀번호는 최소 8글자 이상 입력해주시길 바랍니다.")
  @NotBlank
  @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,30}$",
      message = "비밀번호는 8~30 자리이면서 1개 이상의 알파벳, 숫자, 특수문자를 포함해야합니다.")
  @Schema(description = "비밀번호", example = "zeroChannelPassword")
  private String password;

  @Size(min = 12, message = "비밀번호는 최소 12글자 이상 입력해주시길 바랍니다.")
  @NotBlank
  @Schema(description = "비밀번호 확인", example = "zeroChannelPassword")
  private String checkedPassword;

  @NotBlank(message = "이름은 필수 항목입니다.")
  @Schema(description = "이름", example = "김제로")
  private String name;

  @Size(min = 2, message = "닉네임은 최소 2글자 이상 입력해주시길 바랍니다.")
  @NotBlank
  @Schema(description = "닉네임", example = "버송이")
  private String nickName;
}
