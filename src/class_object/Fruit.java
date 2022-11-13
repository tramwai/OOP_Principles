package class_object;

public class Fruit {

    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;


    // instance block is executed for each object being created
    {
        System.out.println("This is an instance block");
    }
   // static block is executed only once and before everything else in the same class
   static  {
        hasColor = true;
       System.out.println("This is a static block");
    }


}
