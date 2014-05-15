package com.mallgo.old.persistence;

import com.mallgo.old.domain.User;

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
