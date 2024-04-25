package stringTest;

import java.io.BufferedReader;
import java.util.Arrays;

/*
 an anagram occurs when two different words or sentences are compound of the same set of characters.
 */
public class AnagramValidator {

    public static boolean isValid(String text, String anagram) {
        text = prepare(text);
        anagram = prepare(anagram);

        String sortedText = sort(text);
        String sortedAnagram = sort(anagram);

        return sortedText.equals(sortedAnagram);
    }

    private static String sort(String text) {
        char[] chars = prepare(text).toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }

    private static String prepare(String text) {
        return text.toLowerCase()
                .trim()
                .replaceAll("\\s+", "");
    }
}