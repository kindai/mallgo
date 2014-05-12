package com.mallgo.service;

import com.mallgo.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kin on 5/12/14.
 */
public interface AccountService {
    User getAccount(String username);

    User getAccount(String username, String password);

    @Transactional
    void insertAccount(User user);

    @Transactional
    void updateAccount(User user);
}
