package funcInterfaceTest;

@FunctionalInterface
public interface MyInterface {
    public void mySay();

     private void mySay1(){
         System.out.println("Sowmya");
     }

    public static void mySay2() {
        System.out.println("static Method");
    }
    public default void myDisplay()
    {
        System.out.println("Default Display Method");
    }

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}