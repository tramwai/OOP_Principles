package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {

        /**
Create a Teacher object
Create 4 Student objects
Add students to Teacher Student List
Find the age difference bt the oldest and youngest student
 */

        Teacher teacher3 = new Teacher("Alex", "Smith");
        Student student6 = new Student("John", "Doe", 15);
        Student student7 = new Student("Jane", "Doe", 20);
        Student student8 = new Student("Mike", "Smith", 25);
        Student student9 = new Student("Robert", "Smith", 50);

        teacher3.addStudent(student6);
        teacher3.addStudent(student7);
        teacher3.addStudent(student8);
        teacher3.addStudent(student9);

        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;

        for (Student student : teacher3.getStudents()) {
            if(student.age > maxAge) maxAge = student.age;
            if(student.age < minAge) minAge = student.age;
        }
        System.out.println(maxAge - minAge);

//        List<Student> students = new ArrayList<>(Arrays.asList(student6, student7, student8, student9));
//        System.out.println(students.stream().max( -> s.age));

    }
}
