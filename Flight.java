package com.upgrad.frs;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSaet;

    public Flight(String flightNumber, String airline) {
        this.flightNumber = flightNumber;
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightDetails(){
        return "Your Flight Number is "+this.getFlightNumber()+" from airline "+this.getAirline();
    }
    public boolean checkAvailablity(){
        return  bookedSaet<capacity;
    }
    public void incrementBookingCounter(){
        bookedSaet++;
    }
}