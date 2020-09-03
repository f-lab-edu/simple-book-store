package com.youngsuk.bookstore.service;

import com.youngsuk.bookstore.dto.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {
  public boolean isUserPasswordCorrect(UserDto userDto);
  public void insertUserData(UserDto userDto);
}
