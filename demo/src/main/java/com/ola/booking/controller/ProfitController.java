package com.ola.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ola.booking.ride.model.ProfitResponse;
import com.ola.booking.service.ProfitService;

@RestController
@RequestMapping("/api/profit")
public class ProfitController {
	@Autowired
	ProfitService profitService;
	@GetMapping("/amount")
	public ProfitResponse getProfit(@RequestParam String fromdate, @RequestParam String todate) {
		return profitService.getProfit(fromdate, todate) ;
		
	}
	
	

}
