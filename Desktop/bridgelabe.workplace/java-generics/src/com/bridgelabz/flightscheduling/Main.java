package com.bridgelabz.flightscheduling;

public class Main {
    public static void main(String[] args) {
        // Creating Flight instances
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<String> flight2 = new Flight<>("AA202", "Los Angeles", "Tokyo");

        // Creating Booking instances
        Booking<Integer> booking1 = new Booking<>(5001, flight1, "John Doe");
        Booking<String> booking2 = new Booking<>("B102", flight2, "Jane Smith");

        // Display booking details
        booking1.displayBookingInfo();
        System.out.println("----------------");
        booking2.displayBookingInfo();

        // Managing Flights
        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();
    }
}
