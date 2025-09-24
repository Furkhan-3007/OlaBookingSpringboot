package com.ola.booking.ride.model;

public class RideBooking {

    private int bookingId;
    private String customerName;
    private String driverName;
    private String vehicleNumber;
    private String pickupLocation;
    private String dropLocation;
    private String bookingTime;
    private double fare;
    private String status;

    // -------- Constructors ----------
    public RideBooking() {}

    public RideBooking(Integer bookingId, String customerName, String driverName,
                       String vehicleNumber, String pickupLocation,
                       String dropLocation, String bookingTime,
                       double fare, String status) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.bookingTime = bookingTime;
        this.fare = fare;
        this.status = status;
    }

    // -------- Getters & Setters ----------
    public Integer getBookingId() { return bookingId; }
    public void setBookingId(Integer bookingId) { this.bookingId = bookingId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }

    public String getBookingTime() { return bookingTime; }
    public void setBookingTime(String bookingTime) { this.bookingTime = bookingTime; }

    public double getFare() { return fare; }
    public void setFare(double fare) { this.fare = fare; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // -------- ToString ----------
    @Override
    public String toString() {
        return "RideBooking{" +
                "bookingId=" + bookingId +
                ", customerName='" + customerName + '\'' +
                ", driverName='" + driverName + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                ", bookingTime='" + bookingTime + '\'' +
                ", fare=" + fare +
                ", status='" + status + '\'' +
                '}';
    }
}
