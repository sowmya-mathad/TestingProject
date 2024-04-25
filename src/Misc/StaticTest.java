package Misc;

public class StaticTest {
    public static void main(String[] args) {
        B.display();
    }
}

class A {
    static void display() {
        System.out.println("Static class of A");
    }
}

class B extends A{
    static void display() {
        System.out.println("Static class of B");

    }
}