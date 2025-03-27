package com.bridgelabz.flightscheduling;

public class Flight<T> {
    private T flightNumber;
    private String source;
    private String destination;

    public Flight(T flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    public T getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void displayFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }
}
