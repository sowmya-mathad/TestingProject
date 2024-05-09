package Misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> intLst = Arrays.asList(1, 10, 7, 8, 9, 6, 11, 5, 4, 10, 2, 17, 18, 19);
        List<Person> personLst = Arrays.asList(
                new Person(45, "Kim", "F"),
                new Person(35, "sam", "M"),
                new Person(67, "pam", "F"),
                new Person(43, "tom", "M"),
                new Person(78, "Jone", "M"),
                new Person(80, "Tey", "F"),
                new Person(44, "Tim", "F"),
                new Person(23, "Fanny", "M"),
                new Person(20, "Dory", "F"));

        double average = personLst.stream()
                .filter(p -> p.getSex().equals("M"))
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Average Age: " + average);

        Integer sum = personLst.stream()
                .filter(p -> p.getSex().equals("M"))
                .mapToInt(Person::getAge).sum();
        Integer TotalAgeReduce = personLst.stream()
                .map(Person::getAge)
                .reduce(
                        0,
                        (a, b) -> a + b);
        System.out.println("Sum: " + sum + " TotalAgeReduce: " + TotalAgeReduce);

        Map<String, Integer> totalAgeByGender = personLst.stream()
                .collect(Collectors.groupingBy(
                        Person::getSex,
                        Collectors.reducing(
                                0,
                                Person::getAge,
                                Integer::sum)));
        System.out.println("totalAgeByGender Age: " + totalAgeByGender);
        System.out.println("Parllel Stream: " + personLst.stream().filter(p -> p.getSex().equals("M"))
                .mapToInt(Person::getAge).average().getAsDouble());
    }
}

