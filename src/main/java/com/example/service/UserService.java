package com.example.service;

import com.example.model.User;

public interface UserService {
    void addUser(User user);
    User getUserById(String id);
}
