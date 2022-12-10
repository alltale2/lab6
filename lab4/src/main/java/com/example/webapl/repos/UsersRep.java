package com.example.webapl.repos;


import com.example.webapl.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRep extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
