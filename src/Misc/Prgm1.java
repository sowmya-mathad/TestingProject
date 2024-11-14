package Misc;

public class Prgm1 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int n = num % 10;
        System.out.println(sum);
        while (n != 0) {
            sum += (num % 10);
            num = num/10;
            n--;
        }
        System.out.println(sum);
    }
}