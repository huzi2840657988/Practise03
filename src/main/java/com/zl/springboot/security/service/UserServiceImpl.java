package com.zl.springboot.security.service;



import com.zl.springboot.security.dao.UsersMapper;
import com.zl.springboot.security.entity.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper dao;

    @Override
    public List<Users> queryAll() {
        return dao.queryAll();
    }
}
