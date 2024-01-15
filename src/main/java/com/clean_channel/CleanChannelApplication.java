package com.clean_channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@EnableScheduling
@EnableJpaAuditing
@EnableCaching
@SpringBootApplication
public class CleanChannelApplication {

  public static void main(String[] args) {
    SpringApplication.run(CleanChannelApplication.class, args);
  }

}
