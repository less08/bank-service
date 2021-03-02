package com.example.bankservice.service;

import com.example.bankservice.model.Role;
import com.example.bankservice.repository.RoleRepository;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleRepository.getRoleByRoleName((Role.RoleName.valueOf(roleName)))
            .orElseThrow(() -> new NoSuchElementException("No such role as " + roleName));
    }
}
