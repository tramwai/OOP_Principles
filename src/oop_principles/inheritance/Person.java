package oop_principles.inheritance;

public class Person {
    // default constructor
    public Person(){}

    // 2 arg constructor with first name and age
    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    // 3 arg constructor with first name, age and DOB
    public Person(String fName, int age, String DOB) {
       this(fName, age);
        this.DOB = DOB;
    }
    // 4 arg constructor with first name, age, DOB and SSN
    public Person(String fName, int age, String DOB, String SSN) {
        this(fName, age, DOB);
        this.SSN = SSN;
    }

    // instance variables
    public String fName;
    protected int age;
    String DOB;
    private String SSN;

    // getter and setter
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    // eat() method
    public void eat(){
        System.out.println("Person eats");
    }
    // Overload eat() method with a String argument
    public void eat(String str){
        System.out.println("Person eats " + str);
    }
    // sleep() method
    public void sleep(){
        System.out.println("Person sleeps");
    }
    // Overload sleep() method with an int argument
    public void sleep(int hours){
        System.out.println("Person sleeps " + hours + " hours");
    }



    // override toString() method
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }


}
