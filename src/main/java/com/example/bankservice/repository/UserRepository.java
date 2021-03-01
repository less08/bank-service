package com.example.bankservice.repository;

import com.example.bankservice.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u left join fetch u.roles where u.id =?1")
    Optional<User> getUserById(Long id);

    @Query("select u from User u left join fetch u.roles where u.phoneNumber =?1")
    Optional<User> findByPhoneNumber(String phoneNumber);

}
