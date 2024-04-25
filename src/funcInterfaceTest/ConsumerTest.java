package funcInterfaceTest;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// Consumer represents an operation which takes an argument and returns nothing.
// Use : lambda expression  performs some operations on an object.
public class ConsumerTest {
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

        Consumer<Student> IdConsumer = (Student student) -> student.setId(student.getId() - 100);

        for (Student student : listOfStudents) {
            IdConsumer.accept(student);
            System.out.println(student);
        }

        Stream<String> st = Stream.iterate("", (str) -> str + "x");
        System.out.println(st.limit(3).map(str -> str + "y"));
    }
}