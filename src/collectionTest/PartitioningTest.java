package collectionTest;

import pojo.Employee;
import pojo.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class PartitioningTest {

    public static void main(String str[]) {

        List<Employee> empList = new ArrayList<Employee>();

        List<String> skillSet1 = Arrays.asList("java", "python", "AWS");
        List<String> skillSet2 = Arrays.asList("python", "AWS");
        List<String> skillSet3 = Arrays.asList("java", "MS", "AWS");
        List<String> skillSet4 = Arrays.asList("java", "JSP", "PCF", "spring");
        List<String> skillSet5 = Arrays.asList("Java", "python", "AWS");


        Employee emp1 = new Employee(1, "AAAA", skillSet1, 10500, "charlotte", Gender.FEMALE, 25);
        Employee emp2 = new Employee(24, "CCC", skillSet2, 3000, "charlotte", Gender.MALE, 30);
        Employee emp3 = new Employee(3, "GG", skillSet3, 17000, "NY", Gender.FEMALE, 40);
        Employee emp4 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL", Gender.MALE, 45);
        Employee emp5 = new Employee(16, "HHHH", skillSet5, 12000, "NY", Gender.FEMALE, 30);
        Employee emp6 = new Employee(15, "XXX", skillSet4, 61000, "ATL", Gender.FEMALE, 35);
        Employee emp7 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL", Gender.MALE, 27);


        // charlotte, 10500 NY 17000, ATL 61000
        // accorning to work loc high sal

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);

        System.out.println("Input:");
        empList.stream().forEach(emp -> System.out.println(emp.toString()));

        Map<Boolean,List<Employee>> empOddEvenAge = empList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge() % 2 == 0));
        System.out.println("Odd and Even Age Employee List: " );
        empOddEvenAge.forEach((k,v) -> System.out.println("KEY: " + k +
                "\n" + "VALUES: \n" + v));


    }
}