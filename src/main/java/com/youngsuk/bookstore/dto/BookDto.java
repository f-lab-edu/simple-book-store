package com.youngsuk.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.youngsuk.bookstore.common.utils.constants.SortTypeEnum;
import lombok.*;

@NoArgsConstructor
@Getter
public final class BookDto {
  private String bookName;
  private String bookAuthorName;
  private String bookCost;
  private String bookPublishDate;
  private String bookIntroduce;
  private String bookAuthorIntroduce;
  private String bookIndexDescription;
  private String bookLikeCount;

  @JsonIgnore
  private PagingDto pagingDto;

  @JsonIgnore
  private SortTypeEnum sortTypeEnum;

}
