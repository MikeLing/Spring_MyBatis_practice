package com.website.service.impl;

import com.website.dao.UsersDao;
import com.website.entity.Users;
import com.website.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

    public Users getUsersByUsername(String username) {
        return usersDao.getUsersByUsername(username);
    }
}
