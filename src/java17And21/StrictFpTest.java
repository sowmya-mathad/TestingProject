package java17And21;

public strictfp class StrictFpTest {

    public static void main(String[] args) {
        StrictFpTest example = new StrictFpTest();
        System.out.println("Sum: " + example.calculateSum(0.1, 0.2));
    }

    double calculateSum(double a, double b) {
        return a + b;
    }

}
