package com.joineynguyen.rental_booking_backend.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asset")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ownerId;
    private String name;
    private Long description;
    private String assetType;
    private double pricePerDay;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Many assets belong to onw owner (User)
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    // One asset can have many bookings
    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL)
    private List<Booking> bookings;

}
