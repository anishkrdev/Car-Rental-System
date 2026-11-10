package Car_rental_system;

public class Customer {
    private int customerId;
    private String name ;
    private int age;

   public Customer(int CustomerId,String Name,int Age){
       this.customerId = CustomerId;
       this.name = Name;
       this.age = Age;
   }
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayCustomer() {
        System.out.println("ID: " + customerId +
                ", Name: " + name +
                ", Age: " + age);
    }
}
