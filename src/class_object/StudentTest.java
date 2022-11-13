package class_object;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudents); // 0
        System.out.println(Student.program); // Software Engineer in Test Program

        Student student1 = new Student("John", "Doe", 35);
        System.out.println(Student.numberOfStudents);

        Student student2 = new Student("Jane", "Doe", 23);
        System.out.println(Student.numberOfStudents);

        student1.study();
        student2.study();
//        student1.rests();
//        student2.rests();



    }
}
