package Misc;

import java.util.HashMap;

public class Prgm2 {
    public static void main(String[] args) {
        String str = "Programming";
        HashMap<Character, Integer> hmap = new HashMap<>();
        int count;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (c == str.charAt(j)) {
                    count++;
                    hmap.put(c, count);
                }
            }
        }
        System.out.println(hmap);
    }
}