package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.User;
import com.example.vehiclebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateUser(Long userId, User newUser) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setUserName(newUser.getUserName());
            user.setPassword(newUser.getPassword());
            userRepository.save(user);
            return user;
        } else {
            return null;
        }
    }

    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
