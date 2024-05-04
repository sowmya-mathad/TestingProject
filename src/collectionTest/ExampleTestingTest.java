package collectionTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.*;

public class ExampleTestingTest {

    public List<String> filterEmptyStrings(final List<String> originalList) {
        return originalList.stream().filter(str -> !str.trim().isEmpty()).collect(Collectors.toList());
    }

    public String concateNonEmptyString(final List<String> originalList, String delimiter) {
        final List<String> filterd = filterEmptyStrings(originalList);
        return filterd.stream().collect(Collectors.joining(delimiter));
    }

    public String concateNonEmptyStringV2(final List<String> originalList, String delimiter) {
        final List<String> filterd = filterEmptyStrings(originalList);
        return String.join(delimiter, filterd);
    }

    public boolean palindrome(String str) {
        String rev = "";
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            //  rev = rev + str.charAt(i);
            sb = sb.append(str.charAt(i));
        }
        if (str.equals(sb.toString()))
            return true;
        else
            return false;
    }

    @Test
    public void filterEmptyStringsReturnsOnlyNonEmptyStrings() {
        List<String> strings = Arrays.asList("abc", " ", "bc", "delta", " ", "yogen");
        List<String> filtered = filterEmptyStrings(strings);
        filtered.forEach(str -> assertFalse(str.isEmpty()));
        assertTrue(filtered.size() == 4);
    }

    @Test
    public void concateNonEmptyStringReturnsOnlyNonEmptyStringConcat() {
        List<String> strings = Arrays.asList("abc", " ", "bc", "delta", " ", "yogen");
        List<String> filtered = filterEmptyStrings(strings);
        assertEquals("abc$bc$delta$yogen", concateNonEmptyString(filtered, "$"));

    }

    @Test
    public void minMaxTest() {
        List<Integer> list = Arrays.asList(3123, 5656, 78, 3231, 1);
        Integer max = Collections.max(list);
        assertEquals(5656, max.intValue());
    }

    @Test
    public void palindrome() {
        assertTrue(palindrome("Dad"));
        assertFalse(palindrome("sowmya"));
    }

}
