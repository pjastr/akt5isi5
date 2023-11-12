package com.holidays.akt;

class Trip {
    private String destination;
    private double price;

    public Trip(String destination, double price) {
        this.destination = destination;
        if (price < 0) {
            this.price = 10.12;
        } else {
            this.price = price;
        }
        //this.price = price < 0 ? 10.12 : price;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
        //this.price = price >= 0 ? price : this.price;
    }
}
