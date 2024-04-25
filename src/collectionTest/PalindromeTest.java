package collectionTest;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "system";
        String rev = "";
        StringBuilder sb  = new StringBuilder();
        for(int  i = str.length() -1; i >= 0; i--) {
          //  rev = rev + str.charAt(i);
            sb = sb.append(str.charAt(i));
        }
        if(str.equals(sb.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
