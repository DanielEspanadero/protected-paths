package com.springsecurity.protectedpaths.persistence.repo;

import com.springsecurity.protectedpaths.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
