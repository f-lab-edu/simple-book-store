package com.youngsuk.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.youngsuk.bookstore.common.utils.constants.SortTypeEnum;
import lombok.*;

@ToString
@RequiredArgsConstructor
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
  private int bookCategoryCode;

  @NonNull
  private String bookCategoryName;
  @NonNull
  @JsonIgnore
  private PagingDto pagingDto;
  @NonNull
  @JsonIgnore
  private SortTypeEnum sortTypeEnum;
}
