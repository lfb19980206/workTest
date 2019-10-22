package com.lfb.springboot.service;

import com.lfb.springboot.domain.User;


public interface UserService {

    User login(User user);

    User findUserByUsername(String username);
}
