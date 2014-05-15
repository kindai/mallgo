package com.mallgo.old.service;

import com.mallgo.old.domain.User;
import com.mallgo.old.persistence.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountMapper accountMapper;

  @Override
  public User getAccount(String username) {
    return accountMapper.getAccountByUsername(username);
  }

  @Override
  public User getAccount(String username, String password) {
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    return accountMapper.getAccountByUsernameAndPassword(user);
  }

  @Override
  @Transactional
  public void insertAccount(User user) {
    accountMapper.insertAccount(user);
    accountMapper.insertProfile(user);
    accountMapper.insertSignon(user);
  }

  @Override
  @Transactional
  public void updateAccount(User user) {
    accountMapper.updateAccount(user);
    accountMapper.updateProfile(user);

    if (user.getPassword() != null && user.getPassword().length() > 0) {
      accountMapper.updateSignon(user);
    }
  }

}
