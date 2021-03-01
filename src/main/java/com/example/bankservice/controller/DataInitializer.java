package com.example.bankservice.controller;

import com.example.bankservice.model.Role;
import com.example.bankservice.model.User;
import com.example.bankservice.service.RoleService;
import com.example.bankservice.service.UserService;
import java.time.LocalDate;
import java.util.Set;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    @PostConstruct
    private void insertData() {
        Role roleAdmin = new Role();
        roleAdmin.setRoleName(Role.RoleName.ADMIN);
        Role roleUser = new Role();
        roleUser.setRoleName(Role.RoleName.USER);
        roleService.add(roleAdmin);
        roleService.add(roleUser);
        User userAdmin = new User();
        userAdmin.setName("admin");
        userAdmin.setDateOfBirth(LocalDate.of(1997, 4, 3));
        userAdmin.setPhoneNumber("0637593406");
        userAdmin.setPassword("pass");
        userAdmin.setRoles(Set.of(roleAdmin, roleUser));
        userService.add(userAdmin);
    }
}
