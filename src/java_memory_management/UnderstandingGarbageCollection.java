package java_memory_management;

import class_object.Animal;

public class UnderstandingGarbageCollection {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cow", 5);
        Animal a2 = new Animal("Dog", 3);
        Animal a3 = new Animal("Cat", 1);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n-----------\n");
        a1 = a2;
        a3 = null;

        // Explicitly invoking Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);



    }
}
