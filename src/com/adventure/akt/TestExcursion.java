package com.adventure.akt;

class TestExcursion {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Gdańsk", 1000);
        System.out.println(excursion.getSpot());
        System.out.println(excursion.getBudget());
        excursion.setSpot("Warszawa");
        excursion.setBudget(2000);
        System.out.println(excursion.getSpot());
        System.out.println(excursion.getBudget());
    }
}
