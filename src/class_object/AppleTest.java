package class_object;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        System.out.println(apple1);
        System.out.println(apple2);

        System.out.println("\nApple1\n");
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        System.out.println("\nApple2\n");
        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "Sour";
        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);

        System.out.println(apple1);
        System.out.println(apple2);
    }
}
