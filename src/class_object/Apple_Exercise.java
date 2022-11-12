package class_object;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple_Exercise {
    public static void main(String[] args) {

        /**
Create 3 Apple objects with below info

apple1
Red
0.5
Sweet

apple2
Yellow
0.75
Sweet

apple3
Green
1.0
Sour
Print all the objects
 */
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";

        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";

        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "Sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        /*
        Count how many apple objects are sweet
         */
        System.out.println("\nApple Array\n");
        // store apples in an array
        Apple[] apples = {apple1, apple2, apple3};
//        System.out.println(Arrays.toString(apples));
//        System.out.println(apples.length); // 3
//        System.out.println(apples[1]);
//        System.out.println(apples[2].taste); // 3
        int count = 0;
        for (Apple apple : apples) {
            if (apple.taste.equalsIgnoreCase("Sweet")) count++;
        }
        System.out.println(count);

        System.out.println("---------Task 2 -----------");



        Apple[] arr = {
                new Apple("Yellow", "Sour", 0.5),
                new Apple("Red", "Sour", 0.75),
                new Apple("Green", "Sour", 0.5),
                new Apple("Yellow", "Sweet", 1),
                new Apple("Yellow", "Sweet", 1.5)

        };

        for (Apple apple : arr) {
            System.out.println(apple);
        }

        System.out.println("\nRetrieve each info for each apple object and print it");
        for (Apple apple : arr) {
            System.out.println(apple.color);
            System.out.println(apple.price);
            System.out.println(apple.taste);
            System.out.println("------------");
        }

    }


}
