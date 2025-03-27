package com.bridgelabz.flightscheduling;

public class Booking<T> {
    private T bookingId;
    private Flight<T> flight;
    private String passengerName;

    public Booking(T bookingId, Flight<T> flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Details:");
        flight.displayFlightInfo();
    }
}
