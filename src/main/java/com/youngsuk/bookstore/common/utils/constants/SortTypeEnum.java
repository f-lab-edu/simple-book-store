package com.youngsuk.bookstore.common.utils.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortTypeEnum {
  NEWEST("00"), LIKES("01");

  private final String code;

  /*
   * mybatis xml mapper에서 Class에 직접 접근이 불가능 하기 때문에 만든 getNewest, getLikes 메소드
   */
  public SortTypeEnum getNewest() {
    return NEWEST;
  }

  public SortTypeEnum getLikes() {
    return LIKES;
  }
}
