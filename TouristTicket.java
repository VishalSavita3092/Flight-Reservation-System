package com.upgrad.frs;

import java.util.Arrays;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNumber, Flight flight, Passenger passenger, float price, boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNumber, flight, passenger, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

}
