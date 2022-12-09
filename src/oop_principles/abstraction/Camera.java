package oop_principles.abstraction;

import java.util.List;

public interface Camera {

    String color = "Black";
    void takesPhoto();
    void recordsVideo();

    default void method1(){
        System.out.println("This is a default method");
    }
}
