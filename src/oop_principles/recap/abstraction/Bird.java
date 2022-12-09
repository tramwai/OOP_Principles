package oop_principles.recap.abstraction;

public class Bird extends Creature implements Wings, Claws{

    public Bird(String name, int legs, String breathingMethod, String reproducingMethod) {
        super(name, legs, breathingMethod, reproducingMethod);
    }


    public Bird(String name, int legs, String breathingMethod, String reproducingMethod, boolean hasWings, boolean hasClaws) {
        super(name, legs, breathingMethod, reproducingMethod);
        this.hasWings = hasWings;
        this.hasClaws = hasClaws;
    }



    public boolean hasWings;
    public boolean hasClaws;

    @Override
    public void moving() {
        if (legs == 0) System.out.println(name + " cannot walk");
        if (hasWings) System.out.println(name + " is flying");
        else System.out.println(name + " doesn't have fins and cannot fly");
    }

    @Override
    public void breathing() {
        switch (breathingMethod.toLowerCase()){
            case "lungs":
                System.out.println(name + " is air breathing");
                break;
            case "gills":
                System.out.println(name + " is water breathing");
            default:
                System.out.println("This breathing method doesn't exist");
        }
        System.out.println("It is using lungs to breathe oxygen");
    }

    @Override
    public void reproduction() {
        switch (reproducingMethod.toLowerCase()){
            case "eggs":
                System.out.println(name + " is using eggs for reproduction");
                break;
            case "giving birth":
                System.out.println(name + " is giving birth for reproduction");
                break;
            default:
                System.out.println("This reproduction method doesn't exist");
        }
        System.out.println("Birds are laying their eggs in their nest");
    }

    @Override
    public void fly() {
        if (hasWings) System.out.println(name + " can fly");
        else System.out.println(name + " cannot fly");
    }
    @Override
    public void grabs() {
        System.out.println(name + (hasClaws ? " can" : " cannot") + " grab the branch");
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Eagle", 2, "lungs", "eggs", true, true);
        bird.moving();
        bird.breathing();
        bird.reproduction();
        bird.fly();
        bird.grabs();
    }


}
