package com.website.dao;

import com.website.entity.Users;

public interface UsersDao {
    Users getUsersByUsername(String username);
}
