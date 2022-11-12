package class_object;

import java.util.ArrayList;
import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));
        System.out.println("Print each car");
        cars.forEach(System.out::println); // lamda expression

        /*
        Find most expensive car
        count how many cars are black
        find the cheapest car
         Remove all cars that have price more than or equal 20k
         */
        Car mostExpensiveCar = cars.get(0);
        int blackCar = 0;
        for (Car car : cars) {
            if(car.price > mostExpensiveCar.price) mostExpensiveCar = car;
            if (car.color.equalsIgnoreCase("Black")) blackCar++;
        }
        System.out.println(mostExpensiveCar);
        System.out.println(blackCar);

        // Stream filter is better
        cars.stream().filter(car -> car.color.equalsIgnoreCase("Black")).count();


        /*
        Count all cars that are Blue or Beige or 2023 -> 3
        Remove all cars that are Tesla, print the size of the cars -> 3

         */


    }
}
