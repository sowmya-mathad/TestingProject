package funcInterfaceTest;

public class FuncInterfaceTest implements MyInterface{
    public static void main(String[] args) {
        FuncInterfaceTest obj = new FuncInterfaceTest();
        obj.mySay();
        obj.myDisplay();
        MyInterface.mySay2();
    }
    public void mySay()
    {
        System.out.println("Say Something");
    }
}

