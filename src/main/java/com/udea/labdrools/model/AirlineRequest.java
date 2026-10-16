package com.udea.labdrools.model;

public class AirlineRequest {
    private Passenger passenger;
    private Flight flight;
    private Luggage luggage;
    private Seat seat;

    // Getters y Setters
    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public Luggage getLuggage() { return luggage; }
    public void setLuggage(Luggage luggage) { this.luggage = luggage; }

    public Seat getSeat() { return seat; }
    public void setSeat(Seat seat) { this.seat = seat; }
}