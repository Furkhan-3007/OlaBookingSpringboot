package com.ola.booking.ride.model;

public class RideCanceling {
	private Long bookingId;
    private String reason;

    public RideCanceling() {}

    public RideCanceling(Long bookingId, String reason) {
        this.bookingId = bookingId;
        this.reason = reason;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

