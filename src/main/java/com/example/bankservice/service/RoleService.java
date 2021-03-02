package com.example.bankservice.service;

import com.example.bankservice.model.Role;

public interface RoleService {
    void save(Role role);

    Role getByName(String roleName);
}
