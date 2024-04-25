package ThreadsTest;

public class ClassLockTest {
    public static void main(String args[]) {
        Thread11 t1 = new Thread11();
        Thread22 t2 = new Thread22();
        t1.start();
        t2.start();
        }
    public static synchronized void M1() {
        System.out.println("m1 method of thread name" + Thread.currentThread().getName());
    }
    public static synchronized void M2() {
        System.out.println("m2 method of thread name" + Thread.currentThread().getName());
    }
}
class Thread11 extends Thread {
    ClassLockTest objectLockTest = null;
    @Override
    public void run() {
        objectLockTest.M1();
        objectLockTest.M2();
    }
}

class Thread22 extends Thread {

    ClassLockTest obj = null;
    @Override
    public void run() {
        obj.M1();
        obj.M2();
    }
}
