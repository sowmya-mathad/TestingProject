package ThreadsTest;

public class ObjectLockTest {
    public static void main(String args[]) {
        ObjectLockTest objectLockTest = new ObjectLockTest();

        Thread1 t1 = new Thread1(objectLockTest);
        Thread2 t2 = new Thread2(objectLockTest);
        t1.start();
        t2.start();
    }

    public static synchronized void M1() {
        System.out.println("m1 method of thread name" + Thread.currentThread().getName());
    }

    public synchronized void M2() {
        System.out.println("m2 method of thread name" + Thread.currentThread().getName());
    }
}
class Thread1 extends Thread {
    ObjectLockTest objectLockTest = null;
    Thread1(ObjectLockTest objectLockTest){
        this.objectLockTest =  objectLockTest;
    }
    @Override
    public void run() {
        objectLockTest.M1();
        objectLockTest.M2();
    }
}

class Thread2 extends Thread {

    ObjectLockTest obj = null;
    Thread2(ObjectLockTest objectLockTest) {
        this.obj =  objectLockTest;
    }
    @Override
    public void run() {
        obj.M1();
        obj.M2();
    }
}