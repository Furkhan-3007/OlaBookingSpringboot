package com.ola.booking.ride.model;

public class RideCancelingResponse {
	private Long bookingId;
    private String status;
    private String message;

    public RideCancelingResponse() {}

    public RideCancelingResponse(Long bookingId, String status, String message) {
        this.bookingId = bookingId;
        this.status = status;
        this.message = message;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RideCancelResponse{" +
                "bookingId=" + bookingId +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


