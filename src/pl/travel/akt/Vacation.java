package pl.travel.akt;

class Vacation {
    private String location;
    private double cost;

    public Vacation(String location, double cost) {
        this.location = location;
        if (cost < 0) {
            this.cost = 15.50;
        } else {
            this.cost = cost;
        }
        //this.cost = cost < 0 ? 15.50 : cost;
    }

    public String getLocation() {
        return location;
    }

    public double getCost() {
        return cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
        //this.cost = cost >= 0 ? cost : this.cost;
    }
}
