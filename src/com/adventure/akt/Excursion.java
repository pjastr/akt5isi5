package com.adventure.akt;

class Excursion {
    private String spot;
    private double budget;

    public Excursion(String spot, double budget) {
        this.spot = spot;
        if (budget < 0) {
            this.budget = 20.00;
        } else {
            this.budget = budget;
        }
        //this.budget = budget < 0 ? 20.00 : budget;
    }

    public String getSpot() {
        return spot;
    }

    public double getBudget() {
        return budget;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public void setBudget(double budget) {
        if (budget >= 0) {
            this.budget = budget;
        }
        //this.budget = budget >= 0 ? budget : this.budget;
    }
}
