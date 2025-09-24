package com.ola.booking.ride.model;

public class RideBookingResponse {

    private Long bookingId;
    private String status;
    private String message;
    private double fare;

    // -------- Constructors ----------
    public RideBookingResponse() {}

    public RideBookingResponse(Long bookingId, String status, String message, double fare) {
        this.bookingId = bookingId;
        this.status = status;
        this.message = message;
        this.fare = fare;
    }

    // -------- Getters & Setters ----------
    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public double getFare() { return fare; }
    public void setFare(double fare) { this.fare = fare; }

    // -------- ToString ----------
    @Override
    public String toString() {
        return "RideBookingResponse{" +
                "bookingId=" + bookingId +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", fare=" + fare +
                '}';
    }
}
