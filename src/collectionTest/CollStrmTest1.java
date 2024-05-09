package collectionTest;

import pojo.Employee;
import pojo.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class CollStrmTest1 {
    public static void main(String str[]) {

        List<Employee> empList = new ArrayList<Employee>();

        List<String> skillSet1 = Arrays.asList("java", "python", "AWS");
        List<String> skillSet2 = Arrays.asList("python", "AWS");
        List<String> skillSet3 = Arrays.asList("java", "MS", "AWS");
        List<String> skillSet4 = Arrays.asList("java", "JSP", "PCF", "spring");
        List<String> skillSet5 = Arrays.asList("Java", "python", "AWS");


        Employee emp1 = new Employee(1, "AAAA", skillSet1, 10500, "charlotte", Gender.FEMALE, 28);
        Employee emp2 = new Employee(24, "CCC", skillSet2, 3000, "charlotte", Gender.MALE, 35);
        Employee emp3 = new Employee(3, "GG", skillSet3, 17000, "NY", Gender.FEMALE, 40);
        Employee emp4 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL", Gender.MALE, 54);
        Employee emp5 = new Employee(16, "HHHH", skillSet5, 12000, "NY", Gender.FEMALE, 25);

        // charlotte, 10500 NY 17000, ATL 61000
        // accorning to work loc high sal

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        // Get Max age employee
        System.out.println("MAx Age : " + empList.stream().max(Comparator.comparingInt(Employee::getAge)).get());
        System.out.println("Min Age :" + empList.stream().min(Comparator.comparing(Employee::getAge)).get());


        Map<Gender, List<Employee>> grpByGender = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(grpByGender);

        Map<String, List<Employee>> grpByCity = empList.stream()
                .collect(Collectors.groupingBy(Employee::getLocation));
        System.out.println(grpByCity);

        Map<Gender, Long> tst = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(tst);
    }
}
