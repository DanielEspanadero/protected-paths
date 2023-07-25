package com.springsecurity.protectedpaths.controllers;

import com.springsecurity.protectedpaths.persistence.entities.User;
import com.springsecurity.protectedpaths.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('ROLE_VISITANTE', 'ROLE_ADMIN')")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
