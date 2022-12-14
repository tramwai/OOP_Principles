package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, WiFi{



public Samsung(){}

    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung way of calling");
    }

    @Override
    public void text() {
        System.out.println("Samsung way of texting");
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung way of taking photos");
    }

    @Override
    public void recordsVideo() {
        System.out.println("Samsung way of recording videos");
    }

    @Override
    public void connect() {
        System.out.println("Samsung way of connecting to WiFi");
    }
}
