package com.example.bankservice.service;

import com.example.bankservice.model.User;

public interface UserService {
    void save(User user);

    User getById(Long id);

    User getByPhoneNumber(String phoneNumber);

    void remove(Long id);
}
