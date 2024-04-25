package stringTest;


import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class EqualsTest {

    @Test
    public void whenEqualsMethodsUsedOnStrings() {
       String str1 = new String("Sowmya");
       String str2 = new String("Sowmya");
       assertFalse(str1 == str2);
       assertTrue(str1.equals(str2));
    }

    @Test
    public void whenEqualsMethodsUsedOnStringLiterals() {
        String s1 = "Sowmya";
        String s2 = "Sowmya";
        assertTrue(s1 == s2);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void whenInternUsedOnString() {
        String s1 = "Shreyansh";
        String s2 = new String("Shreyansh");

        String s3 = new String("Shreyansh").intern();
        assertFalse(s1==s2);
        assertTrue(s1==s3);
    }

    @Test
    public void givenValidAnagrams_whenSorted_thenEqual() {
        boolean isValidAnagram = AnagramValidator.isValid("Avida Dollars", "Salvador Dali");

        assertTrue(isValidAnagram);
    }
}
