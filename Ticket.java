package com.upgrad.frs;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String pnr, from, to, departureDateTime, arrivalDateTime, seatNumber;
    private Flight flight;
    private Passenger passenger;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNumber, Flight flight, Passenger passenger, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNumber = seatNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus(){
        return this.cancelled ? "Cancelled" : "Confirmed";
    }
    public int getFlightDuration(){
        // 01/01/2021 02:20
        LocalDateTime departureDate = LocalDateTime.parse(this.departureDateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime arrivalDate = LocalDateTime.parse(this.arrivalDateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        Duration duration = Duration.between(departureDate,arrivalDate);
        long second = duration.getSeconds();
        long hours = second/3600;
        return (int)hours;
//        String[] flightArr = this.departureDateTime.split(":");
//        String[] flightArrival = this.arrivalDateTime.split(":");
//        int hour =  Integer.parseInt(flightArrival[0]) - Integer.parseInt(flightArr[0]);

    }
    public void cancel(){
        this.cancelled = true;
    }
}