package com.example.bankservice.service;

import com.example.bankservice.model.User;
import com.example.bankservice.repository.UserRepository;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getUserById(id)
            .orElseThrow(() -> new NoSuchElementException("No such user with id " + id));
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber)
            .orElseThrow(() -> new NoSuchElementException("No such user with phone number "
                    + phoneNumber));
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
