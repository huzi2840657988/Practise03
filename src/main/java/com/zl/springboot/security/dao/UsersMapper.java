package com.zl.springboot.security.dao;



import com.zl.springboot.security.entity.Users;

import java.util.List;

public interface UsersMapper {
    public List<Users> queryAll();
}
