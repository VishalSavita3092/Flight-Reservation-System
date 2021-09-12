package com.upgrad.frs;

public class RegularTicket extends Ticket{
    private String specialService;

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNumber, Flight flight, Passenger passenger, float price, boolean cancelled, String specialService) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNumber, flight, passenger, price, cancelled);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

}
