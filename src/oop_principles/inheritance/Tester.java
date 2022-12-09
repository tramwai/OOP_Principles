package oop_principles.inheritance;

public class Tester extends Person {
    // default constructor
    public Tester(){}

    // 2 arg constructor using the parent class constructor
    public Tester(String fName, int age) {
        super(fName, age);
    }
    // 3 args constructor
    public Tester(String fName, int age, String DOB) {
        super(fName, age, DOB);
    }
    // 4 args constructor
    public Tester(String fName, int age, String DOB, String SSN) {
       super(fName, age, DOB, SSN);
    }

    // 5 args constructor
    public Tester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }
    public boolean isAutomationTester;
    // code() method
    public void code(){
        System.out.println("Tester codes");
    }
    // overload code()
    public void code(String language){
        System.out.println("Tester codes in " + language + " language");
    }

    // Override eat() method
    @Override
    public void eat(){
        System.out.println("Tester eats");
    }
    // Override sleep() method
    @Override
    public void sleep(){
        System.out.println("Tester sleeps");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';
    }
}
