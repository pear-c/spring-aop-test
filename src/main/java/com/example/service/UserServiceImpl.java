package com.example.service;

import com.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private final Map<String, User> userStore = new HashMap<>();

    @Override
    public void addUser(User user) {
        userStore.put(user.getId(), user);
        System.out.println("User added: " + user.getId());
    }

    @Override
    public User getUserById(String id) {
        return userStore.get(id);
    }
}
