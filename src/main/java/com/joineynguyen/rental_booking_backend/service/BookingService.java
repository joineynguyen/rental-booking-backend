package com.joineynguyen.rental_booking_backend.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.joineynguyen.rental_booking_backend.model.Booking;
import com.joineynguyen.rental_booking_backend.repository.BookingRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.getReferenceById(id);
    }

    public List<Booking> getBookingsByClient(Long clientId) {
        return bookingRepository.findByClientId(clientId);
    }

    public List<Booking> getBookingsByAsset(Long assetId) {
        return bookingRepository.findByAssetId(assetId);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
