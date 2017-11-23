package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@Service

public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> userList(){
        return userMapper.userList();
    }
}
