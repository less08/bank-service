package com.example.bankservice.service;

import com.example.bankservice.model.User;
import com.example.bankservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getUserById(id).get();
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber).get();
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
