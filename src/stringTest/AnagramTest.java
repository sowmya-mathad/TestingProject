package stringTest;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string :");
        String s1 = scan.nextLine();
        System.out.println("enter second string :");
        String s2 = scan.nextLine();
        scan.close();
        char[] c1 = s1.toLowerCase().trim().toCharArray();
        char[] c2 = s2.toLowerCase().trim().toCharArray();
        if(s1.length() == s2.length()) {
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean res = Arrays.equals(c1, c2);
            if (res)
                System.out.println("Strings are anagrams");
            else
                System.out.println("Strings are not anagrams");
        }else
            System.out.println("Strings are not anagrams");
    }
}
