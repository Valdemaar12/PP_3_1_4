package ru.bogomolov.springwithbootstrap.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.bogomolov.springwithbootstrap.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);

    User saveUser(User user);

    void deleteById(Long id);

    List<User> findAll();

    User findById(Long id);
}
