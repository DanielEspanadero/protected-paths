package com.springsecurity.protectedpaths.controllers;

import com.springsecurity.protectedpaths.persistence.entities.User;
import com.springsecurity.protectedpaths.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }
}
