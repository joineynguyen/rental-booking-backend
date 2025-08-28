package com.joineynguyen.rental_booking_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joineynguyen.rental_booking_backend.model.User;
import com.joineynguyen.rental_booking_backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
