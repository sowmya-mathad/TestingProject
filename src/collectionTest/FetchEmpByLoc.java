package collectionTest;

import pojo.Employee;
import pojo.Gender;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FetchEmpByLoc {
    public static void main(String str[]) {

        List<Employee> empList = new ArrayList<>();

        List<String> skillSet1 = Arrays.asList("java", "python", "AWS");
        List<String> skillSet2 = Arrays.asList("python", "AWS");
        List<String> skillSet3 = Arrays.asList("java", "MS", "AWS");
        List<String> skillSet4 = Arrays.asList("java", "JSP", "PCF", "spring");
        List<String> skillSet5 = Arrays.asList("Java", "python", "AWS");


        Employee emp1 = new Employee(1, "AAAA", skillSet1, 10500, "charlotte", Gender.FEMALE,25);
        Employee emp2 = new Employee(24, "CCC", skillSet2, 3000, "charlotte", Gender.MALE,30);
        Employee emp3 = new Employee(3, "GG", skillSet3, 17000, "NY", Gender.FEMALE,40);
        Employee emp4 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL",Gender.MALE, 45);
        Employee emp5 = new Employee(16, "HHHH", skillSet5, 12000, "NY", Gender.FEMALE,30);
        Employee emp6 = new Employee(15, "XXX", skillSet4, 61000, "ATL",Gender.FEMALE,35);
        Employee emp7 = new Employee(14, "ZZZ", skillSet4, 61000, "ATL",Gender.MALE,27);


        // charlotte, 10500 NY 17000, ATL 61000
        // accorning to work loc high sal

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);

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

        Map<Integer, Set<Employee>> empSorting = empList.stream()
                .collect(Collectors.groupingBy(Employee::getAge, TreeMap :: new,
                        Collectors.toSet()));
        System.out.println("Sorting: ");
        empSorting.entrySet().stream().forEach(System.out::println);

        System.out.println("Unique Skill Set: FlatMap Demo");

        empList.stream()
                .flatMap(emp ->emp.getSkillSet().stream()).distinct()
                .toList().forEach(x->System.out.print(","+  x));

        System.out.println("\n Checking per month sal of emp: Map Demo");
        empList.stream().map(emp->emp.getSalary()%12).toList().forEach(x->System.out.print(","+  x));

        System.out.println( "\nMin :" + empList.stream().parallel().min((e1,e2)->e1.getId().compareTo(e2.getId())).get());

        System.out.println( "Max :" + empList.stream().max((e1,e2)->e1.getId().compareTo(e2.getId())).get());

    }

}
