package class_object;

public class Student {

    public Student(){}

    //Create a constructor that takes 2 args
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        addStudent();
    }

    //Define public instance variables of Student class as below
    //firstName, lastName, age

    public static int numberOfStudents;

    public static final String program = "Software Engineer in Test Program";

    public String firstName;
    public String lastName;
    public int age;

    public void study(){
        System.out.println(this.firstName + " studies");
    }

    public void rest(){ //
        System.out.println(this.firstName + " " + this.lastName + " rests");
    }

    public static void addStudent(){
        numberOfStudents++;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}