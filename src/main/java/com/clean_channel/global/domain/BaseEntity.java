package com.clean_channel.global.domain;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public abstract class BaseEntity {
  @Column(nullable = false, updatable = false)
  @CreatedDate
  private LocalDateTime createDt;

  @Column(nullable = false)
  @LastModifiedDate
  private LocalDateTime updateDt;
}
