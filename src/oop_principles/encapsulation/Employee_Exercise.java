package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee_Exercise {
    public static void main(String[] args) {
        /**
        Create 3 companies
        name, address, phone
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111

        Create 10 employees
        fullname, jobPosition, age, company
        Andrii, Developer, 25, Tesla
        Yildiz, System Architect, 23, USBank
        Malek, Developer, 30, Verizon
        Saeed, Manager, 35, Verizon
        Samir, Tester, 20, USBank
        Viktoriya, Designer, 30, Tesla
        Ibrahim, Designer, 27, Tesla
        Jeremiah, Scrum Master, 21, USBank
        Olena, Tester, 29, Verizon
        Yoanna, Tester, 23, Tesla
         */

        /**
        Write a program to find and report below information
        Employee numbers for each company
        Tesla = 4
        USBank = 3
        Verizon = 3
        Employee numbers for each position
        Tester = 3
        Developer = 2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1
        Find youngest
        Youngest tester = Samir with the age of 20
        Youngest developer = Andrii with the age of 25
        Youngest designer = Ibrahim with the age of 27
        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank
         */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii","Developer", 25, c1),
                new Employee("Yildiz","System Architect", 23, c2),
                new Employee("Malek","Developer", 30, c3),
                new Employee("Saeed","Manager",35 ,c3),
                new Employee("Samir", "Tester",20, c2),
                new Employee("Viktoriya", "Designer",30 ,c1),
                new Employee("Ibrahim", "Designer",27 ,c1),
                new Employee("Jeremiah", "Scrum Master", 21 , c2),
                new Employee("Olena","Tester", 29, c3),
                new Employee("Yoanna","Tester", 23, c1)
        ));



        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        int totalTesters = 0, totalDevs = 0, totalSM = 0, totalManagers = 0, totalDesigners = 0, totalSA = 0;

        Employee managerEmployee = null;
        Employee systemArchitectEmployee = null;
        Employee scrumMasterEmployee = null;

        Employee youngestDev = new Employee(); // age = 0
        Employee youngestTester = new Employee(); // age = 0
        Employee youngestDesigner = new Employee(); // age = 0

        youngestTester.setAge(Integer.MAX_VALUE);
        youngestDesigner.setAge(Integer.MAX_VALUE);
        youngestDev.setAge(Integer.MAX_VALUE);

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if(employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            switch (employee.getJobPosition()) {
                case "Tester":
                    totalTesters++;
                    if(employee.getAge() < youngestTester.getAge()) youngestTester = employee;
                    break;
                case "Developer":
                    totalDevs++;
                    if(employee.getAge() < youngestDev.getAge()) youngestDev = employee;
                    break;
                case "Scrum Master":
                    totalSM++;
                    scrumMasterEmployee = employee;
                    break;
                case "System Architect":
                    totalSA++;
                    systemArchitectEmployee = employee;
                    break;
                case "Designer":
                    totalDesigners++;
                    if(employee.getAge() < youngestDesigner.getAge()) youngestDesigner = employee;
                    break;
                case "Manager":
                    totalManagers++;
                    managerEmployee = employee;
                    break;
                default:
                    System.out.println("The job is not matching with any case {" + employee.getJobPosition() + "}");
            }
        }

        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("Employee numbers for each position");
        System.out.println("Tester = " + totalTesters);
        System.out.println("Developer = " + totalDevs);
        System.out.println("Scrum Master = " + totalSM);
        System.out.println("Designer = " + totalDesigners);
        System.out.println("System Architect = " + totalSA);
        System.out.println("Manager = " + totalManagers);


        System.out.println("Find the company");
        System.out.println(scrumMasterEmployee.getJobPosition() + " = " + scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());
        System.out.println(systemArchitectEmployee.getJobPosition() + " = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println(managerEmployee.getJobPosition() + " = " + managerEmployee.getFullName() + " works at " + managerEmployee.getCompany().getName());


        System.out.println("\n---------Youngest-------\n");
        System.out.println("Youngest tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());
        System.out.println("Youngest developer = " + youngestDev.getFullName() + " with the age of " + youngestDev.getAge());
        System.out.println("Youngest designer = " + youngestDesigner.getFullName() + " with the age of " + youngestDesigner.getAge());
    }
}
