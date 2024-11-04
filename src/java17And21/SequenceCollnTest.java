package java17And21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequenceCollnTest {
    public static void main(String[] args) {
        SequencedCollection<Integer> intSeq = new ArrayList<Integer>();
        intSeq.add(1);
        intSeq.addFirst(0);
        intSeq.add(4);
        intSeq.add(3);
        intSeq.addLast(2);

        System.out.println("intSeq: " + intSeq);

        Integer firstElement = intSeq.getFirst();  // 0
        Integer lastElement = intSeq.getLast();  // 2

        System.out.println("firstElement: " + firstElement +
                "  lastElement: " + lastElement);
        List<Integer> reversed = (List<Integer>) intSeq.reversed();
        System.out.println("reversed: " + reversed);
    }
}
