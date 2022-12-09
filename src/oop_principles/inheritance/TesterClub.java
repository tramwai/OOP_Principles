package oop_principles.inheritance;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);

        FrontendTester ft2 = new FrontendTester("Eve", 29, "0001", "222", false);
        BackendTester bt2 = new BackendTester("Adam", 36, "0000", "0101", false);

         Tester[] testers = {ft1, ft2, bt1, bt2}; // Polymorphic array

        // count how many manual, automation and average age
        System.out.println(Arrays.stream(testers).filter(t -> !t.isAutomationTester).count());
        System.out.println(Arrays.stream(testers).filter(t -> t.isAutomationTester).count());

        int countManual = 0, countAutomation = 0, sumAge = 0;
        for (Tester tester : testers) {
            if (tester.isAutomationTester) countAutomation++;
            else countManual++;
            sumAge += tester.age;
        }
        System.out.println("Manual testers = " + countManual);
        System.out.println("Automation testers = " + countAutomation);
        System.out.println("Average age = " + sumAge / testers.length);


    }
}
