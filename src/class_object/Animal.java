package class_object;

public class Animal {
    // default constructor
    public Animal(){}

    // 2 args constructor with name and age
    public Animal(String name, int age) {
        System.out.println("This is a 2 args constructors");
        // assign info to the object with <this>
        this.name = name;
        this.age = age;
    }

    // constructor with 5 args
    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        this(name, age);
        System.out.println("This is 5 args constructor");
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    // instance variables
    public static final boolean isExtinct = true;
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    // override toString()
    @Override
    public String toString() {
        // customizing the toString() method
        String result = "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age;
        if (isCarnivore) result += ", isCarnivore=" + isCarnivore;
        if (isHerbivore) result += ", isHerbivore=" + isHerbivore;
        if (isOmnivore) result +=  ", isOmnivore=" + isOmnivore;
        result+= "}";
        return result;
    }


    // testing the new class
    public static void main(String[] args) {
//        Animal a1 = new Animal();
//        Animal a2 = new Animal("Dog", 3);
//        Animal a3 = new Animal("Cow", 5);
//        Animal a4 = new Animal("Cat", 1);

        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 15, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("Printing objects");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println("print static instance variable");
        System.out.println(Animal.isExtinct);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
