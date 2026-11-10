package Car_rental_system;

public class Main {
    public static void main(String[] args) {
        Carrentalservice service = new Carrentalservice();
        service.addCar(new Car(11, "Toyota", "Fortuner", 3000));
        service.addCar(new Car(12, "BMW", "X5", 4000));
        service.addCar(new Car(13, "Audi", "A6", 5000));
        service.addCar(new Car(14, "Alto", "Alto300", 300));
        service.addCar(new Car(15, "Mercedes-benz", "z-class", 7000));

        service.showCars();

        Customer customer2 = new Customer(1005, "Ankit", 26);
        Customer customer5 = new Customer(1009, "Roky", 40);

       service.rentCar(13,customer2 ,5);
       System.out.println("\nAvailable cars after renting:\n");

        service.showCars();
        service.returnCar(13);

        System.out.println("\nAvailable Cars After Return:");

        service.showCars();

    }


}

