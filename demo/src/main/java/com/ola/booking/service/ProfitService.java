package com.ola.booking.service;

import org.springframework.stereotype.Service;

import com.ola.booking.ride.model.ProfitResponse;

@Service
public class ProfitService {
	public ProfitResponse getProfit( String fromdate, String todate) {
		ProfitResponse profitresponse = new ProfitResponse(77.99, todate);
		return profitresponse;

}
}
