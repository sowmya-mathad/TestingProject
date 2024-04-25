package stringTest;

public class PalindromeTest {
    public static void main(String[] args) {




    }
    public boolean isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}
