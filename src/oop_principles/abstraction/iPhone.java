package oop_principles.abstraction;

import oop_principles.recap.abstraction.Wings;

public class iPhone extends Phone implements Camera, WiFi {

     public iPhone(){}

    public iPhone(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone way of calling");
    }

    @Override
    public void text() {
        System.out.println("iPhone way of texting");
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone way of taking photos");
    }

    @Override
    public void recordsVideo() {
        System.out.println("iPhone way of recording videos");
    }


    @Override
    public void connect() {
        System.out.println("iPhone way of connecting to WiFi");
    }
}
