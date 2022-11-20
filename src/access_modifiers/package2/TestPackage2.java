package access_modifiers.package2;

import access_modifiers.package1.BMW;
import access_modifiers.package1.Honda;
import access_modifiers.package1.Toyota;

public class TestPackage2 {
    public static void main(String[] args) {
        Honda h1 = new Honda();
        System.out.println(h1);
       //  Tesla t1 = new Tesla(); -> default class cannot be accessed from another package
        BMW b1 = new BMW();
        System.out.println(b1.make);


    }
}
