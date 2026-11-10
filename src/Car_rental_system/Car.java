package Car_rental_system;

public class Car {
    private int carId;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(int carId, String brand,String model,double pricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }
    //getter method
    public int getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel (){
        return model;
    }
    public double getPricePerDay(){
        return pricePerDay;
    }
    public boolean isAvailable(){
        return available;
    }
//setter method
    public void setBrand(String brand) {      // we cant call getcardid bcs
        this.brand = brand;                   //ek baaar id assign hojayega to whi rhega isiiliye
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void displayCar(){
        System.out.println(
                "ID: " + carId +
                        ", Brand: " + brand +
                        ", Model: " + model +
                        ", Price/Day: Rs." + pricePerDay +
                        ", Available: " + available
        );
    }


    }

