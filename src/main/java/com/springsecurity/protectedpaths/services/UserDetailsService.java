package com.springsecurity.protectedpaths.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
