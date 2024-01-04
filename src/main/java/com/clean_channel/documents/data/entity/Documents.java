package com.clean_channel.documents.data.entity;

import com.clean_channel.category.data.entity.Category;
import com.clean_channel.comment.data.entity.Comment;
import com.clean_channel.global.domain.BaseEntity;
import com.clean_channel.member.data.entity.Member;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "documents")
public class Documents extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long documentsId;

  @Setter
  private String title;
  @Setter
  private String content;

  @OneToMany(mappedBy = "documents", cascade = CascadeType.ALL)
  private List<Comment> comments;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private Category category;
}
