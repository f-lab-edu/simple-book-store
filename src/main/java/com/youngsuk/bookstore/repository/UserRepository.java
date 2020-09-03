package com.youngsuk.bookstore.repository;

import com.youngsuk.bookstore.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository {
  String selectUserPassword(String userId);
  void insertUserData(UserDto userDto);
}
