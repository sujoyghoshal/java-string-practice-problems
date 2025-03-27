package com.bridgelabz.flightscheduling;

import java.util.ArrayList;
import java.util.List;

public class FlightManager<T> {
    private List<Flight<T>> flightList = new ArrayList<>();

    public void addFlight(Flight<T> flight) {
        flightList.add(flight);
        System.out.println("Flight added successfully: " + flight.getFlightNumber());
    }

    public void displayAllFlights() {
        System.out.println("\nList of Available Flights:");
        for (Flight<T> flight : flightList) {
            flight.displayFlightInfo();
            System.out.println("----------------");
        }
    }
}
