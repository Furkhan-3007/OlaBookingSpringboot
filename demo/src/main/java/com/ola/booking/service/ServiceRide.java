package com.ola.booking.service;

import org.springframework.stereotype.Service;

import com.ola.booking.ride.model.RideBooking;
import com.ola.booking.ride.model.RideBookingResponse;

@Service
public class ServiceRide {
	public RideBookingResponse createRide(RideBooking rideBooking) {
		RideBookingResponse response= new RideBookingResponse();
		response.setMessage("HI wait at pick location");
		response.setFare(230.00);
		response.setBookingId(null);
		response.setStatus("Ride In process ");
		response.setBookingId(null);
		return response;
	}
	
}
