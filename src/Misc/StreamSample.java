package Misc;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSample {
    // name genefder/marks of students
    //list of students
    // students separated by gender and then sort by marks
    public static void main(String[] args) {


        List<Student> studentList = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        // 1- Find a list of students whose first name starts with alphabet A
        List<Student> studs = studentList.stream().filter(student -> student.getFirstName().startsWith("A")).toList();
        System.out.println("1: " + studs);

        // 2- Group The Student By Department Names
        Map<String, List<Student>> grpByDeptName = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println("2: " + grpByDeptName);

        // 3- Find the total count of students using stream
        System.out.println("3: " + studentList.stream().count());

        // 4- Find the max-age of the student
        System.out.println("4: " + studentList.stream().max(Comparator.comparing(Student::getAge)));

        // 5- Find all department's names
        List<String> deptNames = studentList.stream().map(Student::getDepartmantName).distinct().toList();
        System.out.println("5: " + deptNames);

        // 6- Find the count of students in each department
        Map<String,Long> countByDept = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println("6: " + countByDept);

        // 7- Find the list of students whose age is less than 30
        List<Student> listAge30 = studentList.stream().filter(student->student.getAge() < 30).toList();
        System.out.println("7: " + listAge30);


        // 8- Find the list of students whose rank is between 50 and 100
        List<Student> listAge50N100 = studentList.stream().filter(student->student.getAge() > 50 && student.getAge() <70 ).toList();
        System.out.println("7: " + listAge50N100);

        // 9- Find the average age of male and female students
        Map<String, Double> avgByGender = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("9: " + avgByGender);

        // 11- Find the Students who stay in Delhi and sort them by their names
        List<Student> StudInDelhi = studentList.stream().filter(student -> student.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(Student::getFirstName)).toList();
        System.out.println("10: " + StudInDelhi);

        // 12- Find the average rank in all departments
        Double avgRankAllDept = studentList.stream().collect(Collectors.averagingInt(Student::getRank));
        System.out.println("11: " + avgRankAllDept);

        // 13- Find the highest rank in each department
        Map<String, Optional<Student>> highRnkPerDept = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName,
                Collectors.maxBy(Comparator.comparing(Student::getRank))));
        System.out.println("12: " + highRnkPerDept);

        // 14- Find the list of students and sort them by their rank
        List<Student> sortByRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).toList();
        System.out.println("13: " + sortByRank);

        // 15- Find the student who has the second rank
        Student student2Rank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println("14: " + student2Rank);

     List<Integer> ints =  Arrays.asList(12,34,1,45,7,232,6,111,0);
        System.out.println(ints.stream().sorted(Comparator.naturalOrder()).toList());
        System.out.println(ints.stream().sorted(Comparator.reverseOrder()).toList());

    }

}
