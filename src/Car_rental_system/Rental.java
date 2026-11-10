package Car_rental_system;

public class Rental {
    private Car car;             //  kaun si car rent pe gai  ye obj h
    private Customer customer;   //kaun sa custmer legya h
    private int days;


    public Rental(Car car, Customer customer, int days) {  //constructor
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public double calculateBill() {
        return days * car.getPricePerDay();
    }

    public void displayRental() {
        System.out.println("----------- Rental Details -----------");
        car.displayCar();
        customer.displayCustomer();
        System.out.println("Days : " + days);
        System.out.println("Total Bill : Rs " + calculateBill());
        System.out.println("--------------------------------------");
    }
}
