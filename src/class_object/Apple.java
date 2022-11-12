package class_object;

public class Apple {

    // default constructor provided by java to create zero argument object
    public Apple(){
        // each time you create a new object , this block is executed

    }
    // instance variables - fields - states - attributes
    public String color; //null
    public String taste; // null
    public double price; // o.o


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }

}
