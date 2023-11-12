package com.holidays.akt;

class TestTrip {
    public static void main(String[] args) {
        Trip trip = new Trip("Warsaw", 100.0);
        System.out.println(trip.getDestination());
        System.out.println(trip.getPrice());
        trip.setDestination("Cracow");
        trip.setPrice(200.0);
        System.out.println(trip.getDestination());
        System.out.println(trip.getPrice());
    }
}
