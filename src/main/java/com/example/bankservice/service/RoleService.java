package com.example.bankservice.service;

import com.example.bankservice.model.Role;

public interface RoleService {
    void add(Role role);

    Role getByName(String roleName);
}
