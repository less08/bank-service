package com.example.bankservice.service;

import com.example.bankservice.model.Role;
import com.example.bankservice.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleRepository.getRoleByRoleName((Role.RoleName.valueOf(roleName))).get();
    }
}
