package stringTest;

public class StringEqualsTest {
    public static void main(String[] args) {
        String s1 = "Sowmya";
        String s2 = "Sowmya";
        String s3 = new String("Sowmya");
        String s4 = new String("Sowmya").intern();
        String formatted = String.format("Title is %s", s1);

        System.out.println("formatted : " + formatted);

        System.out.println("S1 : " + s1);
        System.out.println("S2: " + s2);
        System.out.println("S3: " + s3);
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 == s4 " + (s1 == s4));

        System.out.println("s1.equals(s3)" + s1.equals(s3));



    }
}
