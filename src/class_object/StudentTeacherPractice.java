package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice {
    public static void main(String[] args) {
        // 2 teachers
        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Morgan");

        // 5 students
        Student student1 = new Student("Mike", "Smith", 25);
        Student student2 = new Student("Jane", "Smith", 30);
        Student student3 = new Student("A", "X", 17);
        Student student4 = new Student("B", "Y", 19);
        Student student5 = new Student("C", "Z", 21);
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);
        System.out.println(teacher1.getStudents());

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        // Find student of Alex and find average age

        int sumOfAges = 0;
        int totalStudents = 0;
        for (Teacher teacher : teachers) {
            if (teacher.fName.equals("Alex")){
                totalStudents = teacher.getStudents().size();
                for(Student student : teacher.getStudents()){
                    sumOfAges += student.age;
                }
            }
        }
        System.out.println(sumOfAges / totalStudents);
    }

}
