package com.example.service;

import com.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    // 생성자 주입
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }
}
