package com.joineynguyen.rental_booking_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joineynguyen.rental_booking_backend.model.Asset;
import com.joineynguyen.rental_booking_backend.model.User;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    // Custom query methods
    User findByOwnerId(Long ownerId);
}
