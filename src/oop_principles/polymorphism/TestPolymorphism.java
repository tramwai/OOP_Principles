package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        Cat c1 = new Cat();
        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();
        d1.bark();

        // Up casting -child in the shape of parent
        //parent reference = child object
        System.out.println("======Up-Casting========\n");
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a3.sleep();

        System.out.println("======Down-Casting========\n");
        //Cat cat = (Cat) new Animal(); // bad example - ClassCastException
        Animal myDog = new Dog(); // first you up - cast
        Dog newDog = (Dog) myDog; // then you down - cast the upcast
        newDog.bark();



    }
}
