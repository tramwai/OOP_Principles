package class_object;

public class Car {

    // default constructor
    public Car(){

    }

    // 5 args constructor
    public Car(String color, String make, String model, int year, double price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Instance Variables
    public String color;
    public String make;
    public String model;
    public int year;
    public double price;

    // override toString() method
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
