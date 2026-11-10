package Car_rental_system;

import java.util.ArrayList;

public class Carrentalservice {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();


    public void addCar(Car car){
        cars.add(car);

    }
    public void showCars() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.displayCar();
            }
        }
    }

    public void rentCar(int carId, Customer customer,int days){
        for(Car car : cars){
            if(car.getCarId()==carId){

                if (car.isAvailable()) {
                    Rental rental = new Rental(car, customer, days);
                    rentals.add(rental);

                    car.setAvailable(false);
                    System.out.println("Car rented successfully!");
                    return;
                }
                else {
                    System.out.println("Car is not available.");
                    return;
                }
            }
        }
        System.out.println("Car not found.");

    }
    public void returnCar(int carId) {

        for (Car car : cars) {

            if (car.getCarId() == carId) {

                car.setAvailable(true);

                System.out.println("Car returned successfully!");
                return;
            }
        }

        System.out.println("Car not found.");
    }
            }
