package com.ola.booking.service;

import org.springframework.stereotype.Service;

import com.ola.booking.ride.model.RideCancelingResponse;

@Service
public class CancelRideservice {
	public RideCancelingResponse cancelRide(Long bookingId) {
        RideCancelingResponse response = new RideCancelingResponse();

        // Simple logic: if bookingId is valid, cancel ride
        if (bookingId != null && bookingId > 0) {
            response.setBookingId(1022L);
            response.setStatus("CANCELLED");
            response.setMessage("Ride has been cancelled successfully.");
        } else {
            response.setBookingId(100L);
            response.setStatus("FAILED");
            response.setMessage("Invalid booking ID. Ride cancellation failed.");
        }

        return response;
    }

}
