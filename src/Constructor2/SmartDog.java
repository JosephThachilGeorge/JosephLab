package Constructor2;

public class SmartDog {

    private String name;
    private double price;


    public SmartDog() {

        System.out.println();

        // Initialize the name to "Unknown" and the price to 0.0

        this.name = "UnKnown";
        this.price = 0.0;
    }

    public SmartDog(String name, double price) {

        // Initialize name and price instance variables
// with the name and price parameters
        this.name = name;
        this.price = price;

        System.out.println("Using SmartDog(String, double) constructor");
    }

    public void bark() {
        System.out.println(name + " is barking...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public void printDetails() {
        System.out.print("Name: " + this.name);
        if (price > 0.0) {
            System.out.println(", price: " + this.price);
        } else {
            System.out.println(", price: Free");
        }
    }

}
