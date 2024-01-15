package com.clean_channel.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터체인에 등록됨
public class SecurityConfig {
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/member/**").authenticated()
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/login", "/sign-up").permitAll()
        .anyRequest().permitAll()
        .and()
        .formLogin()
        .loginPage("/login");
    return httpSecurity.build();
  }

  //Bean 으로 등록하면 해당 메소드의 리턴되는 오브젝트를 IoC로 등록해줌
  @Bean
  public BCryptPasswordEncoder encodePassword() {
    return new BCryptPasswordEncoder();
  }
}
