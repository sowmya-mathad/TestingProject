package collectionTest;

import pojo.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
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
        Employee emp2 = new Employee(24, "CCC", skillSet2, 3000, "charlotte");
        Employee emp3 = new Employee(3, "GG", skillSet3, 17000, "NY");
        Employee emp4 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL");
        Employee emp5 = new Employee(16, "HHHH", skillSet5, 12000, "NY");

        // charlotte, 10500 NY 17000, ATL 61000
        // accorning to work loc high sal

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        System.out.println("Input:");

        for (Employee em : empList) {
            System.out.println(em);
        }

        System.out.println("Sorted: Ascending");

        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> empLoc = empList.stream().
                collect(Collectors.groupingBy(Employee::getLocation,
                        Collectors.reducing(BinaryOperator.maxBy((bySalary)))));
        empLoc.entrySet().stream().forEach(System.out::println);

        System.out.println("Sorted: Descending");
        Map<String, Optional<Employee>> empDescList = empList.stream()
                .collect(Collectors.groupingBy(Employee :: getLocation,
                        Collectors.reducing(BinaryOperator
                                .minBy(Comparator.comparing(Employee::getSalary)))));
        empDescList.entrySet().stream().forEach(System.out::println);

//        ConcurrentMap<String, Optional<Employee>> conEmp = empList.stream()
//                .collect(Collectors.groupingBy(Employee :: getLocation,
//                        Collectors.reducing(BinaryOperator
//                                .minBy(Comparator.comparing(Employee::getSalary)))));
//        empDescList.entrySet().stream().forEach(System.out::println);
    }

}
