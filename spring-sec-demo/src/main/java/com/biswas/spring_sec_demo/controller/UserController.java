package com.biswas.spring_sec_demo.controller;

import com.biswas.spring_sec_demo.model.User;
import com.biswas.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
