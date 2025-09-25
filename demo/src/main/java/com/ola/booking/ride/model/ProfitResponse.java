package com.ola.booking.ride.model;

public class ProfitResponse {
	private double amount;
	private String date;
	
	
	public ProfitResponse(double amount, String date) {
		super();
		this.amount = amount;
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ProfitResponse [amount=" + amount + ", date=" + date + "]";
	}
	
	
}
