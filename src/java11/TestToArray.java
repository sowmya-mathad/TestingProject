package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestToArray {
    public static void main(String args[]) {
        List<String> strList = Arrays.asList("Sowmya", "Julia", "   ", "Maria", "Jacque");
        strList.forEach(System.out::println);
        System.out.println("Num of blank String: " + strList.stream().filter(Predicate.not(String::isBlank))
                .map(String::toUpperCase).toList());

//        Consumer<Employee> empCon = Employee :: new;
//        String[] abc = strList.toArray(String[] :: new);
//        for (String s : abc) {
//            System.out.print(s +", ");
//        }
    }
}
