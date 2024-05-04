package collectionTest;

import pojo.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FetchEmpByLoc {
    public static void main(String str[]) {

        List<Employee> empList = new ArrayList<Employee>();

        List<String> skillSet1 = Arrays.asList("java", "python", "AWS");
        List<String> skillSet2 = Arrays.asList("python", "AWS");
        List<String> skillSet3 = Arrays.asList("java", "MS", "AWS");
        List<String> skillSet4 = Arrays.asList("java", "JSP", "PCF", "spring");
        List<String> skillSet5 = Arrays.asList("Java", "python", "AWS");


        Employee emp1 = new Employee(1, "AAAA", skillSet1, 10500, "charlotte");
        Employee emp2 = new Employee(24, "AAAA", skillSet2, 3000, "charlotte");
        Employee emp3 = new Employee(3, "AAAA", skillSet3, 17000, "NY");
        Employee emp4 = new Employee(14, "AAAA", skillSet4, 61000, "ATL");
        Employee emp5 = new Employee(16, "AAAA", skillSet5, 12000, "NY");

        // charlotte, 10500 NY 17000, ATL 61000
        // accorning to work loc high sal

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        System.out.println("Input:");
        for (Employee em : empList) {
            System.out.println(em);
        }

        System.out.println("Sorted:");

        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> empLoc = empList.stream().
                collect(Collectors.groupingBy(Employee::getLocation,
                        Collectors.reducing(BinaryOperator.maxBy((bySalary)))));
        empLoc.entrySet().stream().forEach(System.out::println);

    }

}
