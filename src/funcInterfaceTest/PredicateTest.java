package funcInterfaceTest;

import pojo.Student;

import java.util.*;
import java.util.function.Predicate;

// Predicate represents an operation which takes an argument T and returns a boolean
//  Use: lambda expression to performs some test on an argument
//  and returns true or false depending upon outcome of the test.
class PredicateTest {
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

        Predicate<Student> mathPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        List<Student> mathStudentList = new ArrayList<>();
        for (Student student : listOfStudents)
            if (mathPredicate.test(student))
                mathStudentList.add(student);
        System.out.println("Mathematics Specialization List: ");
        mathStudentList.forEach(System.out::println);

        Predicate<Student> computerPredicate = (Student student) -> student.getSpecialization().equals("Computers");
        List<Student> compStudentList = new ArrayList<>();
        for (Student student : listOfStudents) {
            if(computerPredicate.test(student))
                compStudentList.add(student);
        }
        System.out.println("\nComputers Specialization List: ");
        compStudentList.forEach(System.out::println);

        Predicate<Student> IdPredicate = (Student student) -> student.getId() < 1000;
        List<Student> IdStudentList = new ArrayList<>();
        for (Student student : listOfStudents) {
            if(IdPredicate.test(student))
                IdStudentList.add(student);
        }
        System.out.println("\nStudent Id within 1000 List: ");
        IdStudentList.forEach(System.out::println);
    }
}