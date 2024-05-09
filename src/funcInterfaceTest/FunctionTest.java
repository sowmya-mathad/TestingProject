package funcInterfaceTest;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// Function represents an operation which takes an argument of type T
// and returns a result of type R.
// Use:  functional interface if you want to extract some data from an existing data
public class FunctionTest {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        Function<Student, String> nameFunction = Student::getName;
        List<String> studentNameLst = new ArrayList<>();
        for (Student student : listOfStudents) {
            studentNameLst.add(nameFunction.apply(student));
        }
        studentNameLst.forEach(System.out :: println);
    }
}