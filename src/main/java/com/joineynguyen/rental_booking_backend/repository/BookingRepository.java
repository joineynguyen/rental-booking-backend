package com.joineynguyen.rental_booking_backend.repository;

import com.joineynguyen.rental_booking_backend.model.Booking;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom query methods
    List<Booking> findByClientId(Long userId);

    List<Booking> findByAssetId(Long assetId);
}
