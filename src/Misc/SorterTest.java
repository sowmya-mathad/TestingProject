import Misc.Namer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class SorterTest {
    public static void main( String[] args) {
        Consumer<Namer> printit = e -> System.out.println(e.getFirstName() + " " + e.getLastName());
        List<Namer> names = new ArrayList(Arrays.asList(
                new Namer("Harry", "Smith"),
                new Namer("Joe", "Smith"),
                new Namer("Jane", "Doe"),
                new Namer("Mary", "Jane"),
                new Namer("Harry", "HomeOwner")));
        names.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));

//        Collections.sort(names, (Namer e1, Namer e2) ->
//                e1.getFirstName().compareTo(e2.getFirstName()));
//        names.removeIf(e->e.getFirstName().equals("Mary"));
//        names.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));

//        Comparator<Namer> groupBy = Comparator.comparing(e->e.getLastName());
//        groupBy = groupBy.thenComparing(e->e.getFirstName());
//        names.removeIf(e->e.getFirstName().equals("Mary"));
//        names.sort(groupBy);
//        names.forEach(printit);
        System.out.println("-------------");
        Comparator<Namer> groupBy = Comparator.comparing(e->e.getFirstName());
        groupBy = groupBy.thenComparing(e->e.getLastName());
        names.removeIf(e->e.getFirstName().equals("Mary"));
        names.sort(groupBy);
        names.forEach(printit);
    }
}
