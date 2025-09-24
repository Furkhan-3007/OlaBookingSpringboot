package com.ola.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.ola.booking.ride.model.RideBooking;
import com.ola.booking.ride.model.RideBookingResponse;
import com.ola.booking.service.ServiceRide;

@RestController
@RequestMapping("/api/ride")
public class ControllerRide {
	@Autowired
	private final ServiceRide rideService = new ServiceRide();
	@PostMapping("/book")
	RideBookingResponse bookRide(@RequestBody RideBooking rideBooking) {
		RideBookingResponse response = rideService.createRide(rideBooking);
		return response;
	}
	
}
