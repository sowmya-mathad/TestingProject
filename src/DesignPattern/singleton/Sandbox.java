package DesignPattern.singleton;

public class Sandbox {
    public static void main(String[] args) {

        ThreadSafeSingleInstance instance1 =
                ThreadSafeSingleInstance.createInstance();
        System.out.println("Created : " + instance1.getInfo());

        ThreadSafeSingleInstance instance2 =
                ThreadSafeSingleInstance.createInstance();
        instance2.setInfo("4324343@$");
        System.out.println("Created 1: " + instance1.getInfo());
        System.out.println("Created 2: " + instance2.getInfo());
    }
}
