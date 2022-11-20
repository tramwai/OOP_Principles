package oopPractice;

public class Sword {


    // static code block - running only ONCE before everything
    static{
        System.out.println("Starting the sword - making furnace");
    }
    // non-static block - running everytime when you create object before everything, but after static code block
    {
        System.out.println("Heating up the furnace");
    }
    // 1. Constructor
    // Default Constructor
    // public Sword(){
    // }

    // Modified Constructor nr1
    public Sword(String material){
       this.material = material;
    }

    // Modified Constructor nr2
    public Sword(double weight, double length, String name, String material){
      this(material); // constructor chaining
        this.weight = weight; // assign the value of local variable in the instance variable
      this.length = length;
      this.name = name;

    }

    // 2. Instance variables
    // static -> belongs to the class - What does every sword have?
    public static final boolean hasHandle = true;
    public static boolean isSharp;

    // non - static -> belongs to the object - What is changing with each sword?
    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Methods(actions) -> What does a sword do?

    // static ones -> belongs to the class. What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    public static void damage(){
        if (isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages less");
    }

    // non-static ones -> belongs to the object. What does every sword do differently?
    // weight * length = 2lb * 10in = 20 points
    // weight * length = 10lb * 15in = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }


}
