package collectionTest.Hashg;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertTrue;

public class Treeset {

    @Test
    public void TreeSetTest() {
        Set<String> treeset = new TreeSet<>();
        treeset.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        System.out.println("TreeSetTest: " + treeset);
    }

    @Test
    public void HashSetTest() {
        Set<String> treeset = new HashSet<>();
        treeset.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        System.out.println("HashSetTest:" + treeset);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void TreeSetTestNullInsert() {
        Set<String> treeset = new TreeSet<>();
        treeset.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        treeset.add(null);
        System.out.println("TreeSetTestNullInsert: " + treeset);
    }

    @Test
    public void HashSetTestNullInsert() {
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        hashSet.add(null);
        hashSet.add(null);
        assertTrue(hashSet.size() == 4);
        System.out.println("HashSetTestNullInsert: " + hashSet);
    }

    @Test
    public void HashSetTestDuplicateTest() {
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        hashSet.add("Sowmya");
        hashSet.add("Sowmya");
        assertTrue(hashSet.size() == 4);
        System.out.println("hashSet duplication: " + hashSet);
    }
    @Test
    public void TreeSetTestDuplicateTest() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(new String[]{"sdfdf", "fsdfsdf", "grsdasd"}));
        treeSet.add("Sowmya");
        treeSet.add("Sowmya");
        System.out.println("treeSet duplication: " + treeSet);
    }
}
