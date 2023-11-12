package pl.travel.akt;

class TestVacation {
    public static void main(String[] args) {
        Vacation vacation = new Vacation("Gdańsk", 1000);
        System.out.println(vacation.getLocation());
        System.out.println(vacation.getCost());
        vacation.setLocation("Warszawa");
        vacation.setCost(2000);
        System.out.println(vacation.getLocation());
        System.out.println(vacation.getCost());
    }
}
