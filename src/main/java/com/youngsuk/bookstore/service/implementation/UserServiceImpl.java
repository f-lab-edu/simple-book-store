package com.youngsuk.bookstore.service.implementation;

import com.youngsuk.bookstore.repository.UserRepository;
import com.youngsuk.bookstore.dto.UserDto;
import com.youngsuk.bookstore.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void insertUser(UserDto userDto) {
    String hashedPassword = BCrypt.hashpw(userDto.getUserPassword(), BCrypt.gensalt());
    userDto.setUserPassword(hashedPassword);
    userRepository.insertUser(userDto);
  }

  @Override
  public void deleteUser(String userId) {
    userRepository.deleteUser(userId);
  }

  @Override
  public void updateUser(UserDto userDto) {
    userRepository.updateUser(userDto);
  }

  @Override
  public boolean selectUserPassword(UserDto userDto) {
    String password = userRepository.selectUserPassword(userDto.getUserId());
    return BCrypt.checkpw(userDto.getUserPassword(), password);
  }


}


