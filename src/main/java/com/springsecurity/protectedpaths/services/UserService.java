package com.springsecurity.protectedpaths.services;

import com.springsecurity.protectedpaths.persistence.entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
    public void registerUser(User user);
    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUserById(Long id);
}
