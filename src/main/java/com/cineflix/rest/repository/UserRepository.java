package com.cineflix.rest.repository;

import com.cineflix.rest.entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
