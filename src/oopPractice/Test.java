package oopPractice;

public class Test {
    public static void main(String[] args) {
        // object1
        System.out.println("\nSword1 is created after this line\n");
        Sword sword1 = new Sword("Iron"); // modified constructor nr1
        System.out.println("Printing out sword1" + sword1);

        // object2
        System.out.println("\nSword2 is created after this line\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", "iron"); // modified constructor nr2
        System.out.println("Printing out sword2" + sword2);

        // object3
        System.out.println("\nSword2 is created after this line\n");
        Sword sword3 = new Sword(10, 25.0, "super long sword", "titanium"); // modified constructor nr2
        System.out.println("Printing out sword3" + sword3);

        System.out.println("\nWorking with static values\n");

        System.out.println("hasHandle = " + Sword.hasHandle);
        System.out.println("isSharp before = " + Sword.isSharp); // default value = false
        Sword.damage();
        // Sword.hasHandle = false; error because it is final and it cannot be changed

        Sword.isSharp = true;
        System.out.println("isSharp before = " + Sword.isSharp); // reeassigned value = true
        Sword.damage();
        // call the static method
        Sword.slash();

        System.out.println("\nWorking with non-static values\n");
        sword1.harms(); // 0.0
        sword2.harms(); // 3.5 * 15 = 52.5.0
        sword3.harms(); // 10 * 25 = 250.0


    }
}
