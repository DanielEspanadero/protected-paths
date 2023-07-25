package com.springsecurity.protectedpaths.controllers;

import com.springsecurity.protectedpaths.persistence.entities.User;
import com.springsecurity.protectedpaths.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {
    private final UserService userService;

    @Autowired
    public UserDetailController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    @PreAuthorize("hasAnyRole('ROLE_VISITANTE', 'ROLE_ADMIN')")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "User deleted successfully!";
    }
}
