package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserService 빈 가져오기
        UserService userService = (UserService) context.getBean("userService");

        // 테스트: 사용자 추가 및 조회
        User user1 = new User("1", "Alice", "alice@example.com");
        userService.addUser(user1);

        User retrievedUser = userService.getUserById("1");
        System.out.println("Retrieved User: " + retrievedUser);
    }
}
