package com.zl.springboot.security.service;

import com.zl.springboot.security.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> queryAll();
}
