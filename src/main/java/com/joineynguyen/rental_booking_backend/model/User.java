package com.joineynguyen.rental_booking_backend.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // One user can own many assets
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Asset> assets;

    // One user can have many bookings
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Booking> bookings;

}
