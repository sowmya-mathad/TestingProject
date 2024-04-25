package DesignPattern.singleton;

/**
 * Double check locking design pattern applied to singleton
 */
public class ThreadSafeSingleInstance {
    private static volatile ThreadSafeSingleInstance instance;
    private String info = "Initial Class Info";

    private ThreadSafeSingleInstance() {
    }

    public static ThreadSafeSingleInstance createInstance() {
        if(instance == null)
            synchronized (ThreadSafeSingleInstance.class) {
                if(instance == null)
                    instance = new ThreadSafeSingleInstance();
            }

        return instance;
    }
    /**
     * Returns the current instance of the singleton.
     *
     * @return the current instance of the singleton

    public static synchronized ThreadSafeSingleInstance createInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleInstance();
        return instance;
    } */

    // getters and setters

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}