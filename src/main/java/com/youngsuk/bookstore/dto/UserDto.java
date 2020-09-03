package com.youngsuk.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class UserDto {
  private String userId;
  private String userName;
  private String userEmail;
  @JsonIgnore
  private String userPassword;
}
