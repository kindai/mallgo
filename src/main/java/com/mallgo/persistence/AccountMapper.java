package com.mallgo.persistence;

import com.mallgo.domain.User;

public interface AccountMapper {

  User getAccountByUsername(String username);

  User getAccountByUsernameAndPassword(User user);

  void insertAccount(User user);
  
  void insertProfile(User user);
  
  void insertSignon(User user);

  void updateAccount(User user);

  void updateProfile(User user);

  void updateSignon(User user);

}
