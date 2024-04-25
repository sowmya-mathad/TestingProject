package stringTest;

import java.util.Scanner;

public class REverseString {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s1 = scan.nextLine();
        char[] c1 = s1.toCharArray();
        char[]  rev = new char[s1.length()];
        System.out.println("String length: " + c1.length);
    int j= 0;
        for(int i = c1.length-1; i >= 0 ; i--) {
             rev[j] = c1[i];
            j++;
         }
        System.out.println("Reversed String: " + new String(rev));
    }
}
