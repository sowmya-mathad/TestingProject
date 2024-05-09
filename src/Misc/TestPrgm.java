import java.util.stream.Stream;

public class TestPrgm {
    public TestPrgm() {
        this(10);
    }
    public TestPrgm(int data) {
        this.data = data;
    }
    public void display() {
        class Decrement {
            int data = 0;
            public void decrement() {
                data --;
            }
        }
        Decrement d = new Decrement();
        d.decrement();
        System.out.println("data: " + data);

    }
    private int data;
     static class Helper {
         private int data1;
         public void bump(int inc) {
             inc++;
             data1 = data1 + inc;
         }
     }
    public static void main(String[] args) {
        int data = 0;
        TestPrgm test =  new TestPrgm();
        test.display();
        System.out.println("data: " + data);

        int a = 9,  b = 2;
        float f;
        f = a / b;
        System.out.println("f : " + f);
        f = f / 2;
        System.out.println("f : " + f );
        f= a + b / f;
        System.out.println("f : " + f );

        Helper h = new Helper();
        int data1 = 2;
        h.bump(2);
        System.out.println(h.data1+ "-----" + data1);

        System.out.println(Stream.of("green, yellow","blue")
                .max((s1,s2) -> s1.compareTo(s2))
                .filter(s -> s.endsWith("n"))
                .orElse("yellow"));
    }
}
