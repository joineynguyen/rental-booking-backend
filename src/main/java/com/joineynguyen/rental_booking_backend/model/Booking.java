package com.joineynguyen.rental_booking_backend.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long assetId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String status; // e.g., PENDING, CONFIRMED, CANCELLED
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Many bookings to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User client;

    // Many bookings to one asset
    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

}
