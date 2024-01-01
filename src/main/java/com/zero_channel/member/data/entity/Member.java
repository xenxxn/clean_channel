package com.zero_channel.member.data.entity;

import com.zero_channel.comment.data.entity.Comment;
import com.zero_channel.documents.data.entity.Documents;
import com.zero_channel.global.domain.BaseEntity;
import com.zero_channel.member.data.type.Authority;
import com.zero_channel.member.data.type.LoginType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "member")
public class Member extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long memberId;
  private String email;

  @Setter
  private String password;
  private String name;

  @Setter
  private String nickName;

  @Enumerated(EnumType.STRING)
  private LoginType loginType;
  private String googleId;

  @Enumerated(EnumType.STRING)
  private Authority authority;

  private boolean isAuthenticatedEmail;

  @Setter
  private String profileUrl;

  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
  private List<Documents> documents;

  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
  private List<Comment> comments;


}
