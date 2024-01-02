package com.zero_channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class ZeroChannelApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZeroChannelApplication.class, args);
  }

}
