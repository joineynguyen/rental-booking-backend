package com.joineynguyen.rental_booking_backend.repository;

import com.joineynguyen.rental_booking_backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods
    User findByEmail(String email);
}
