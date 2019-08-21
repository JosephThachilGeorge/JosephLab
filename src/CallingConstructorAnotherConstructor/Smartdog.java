/*
A constructor may call another constructor of the same class. Let’s consider the following Test class. It declares two
constructors; one accepts no parameters and one accepts an int parameter.
 */

package CallingConstructorAnotherConstructor;

public class Smartdog {

    private String name;
    private double price;

    public Smartdog() {
// Call another constructor with "Unknown" and 0.0 as parameters
        this("Unknown", 0.0);

        System.out.println("Using SmartDog() constructor");
    }

    public Smartdog(String name, double price) {
// Initialize name and price to specified name and price
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



