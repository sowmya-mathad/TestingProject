package Misc;

public class ABCBack {
    int phone=312345;
    double getPhone(){
        System.out.print("phone number received");
        return phone;
    }
    public static void main(String[] args) {
        ABCBack bank=new ABCBack();
        System.out.print(bank.getPhone());

        long x = 88843; // Line 1
        float y= x; //Line 2
        double z=x+y; //Line 3
        double price=30.0f;
        System.out.println(z);


//        int i = 1,j = -1;
//        switch (i) {
//            case 0, 1:
//                j = 1;
//            case 2:
//                j = 2;
//            default:
//                j = 0;
//        }
//        System.out.println("j="+j);

//        float f =12;
//        switch (f) { // Line 1
//            case 10 + 1:
//                System.out.println("Twelve"); // Line 2
//            case 0:
//                System.out.println("Zero"); //Line 3
//            case (int) 12.0:
//                System.out.println("Decimal");
//            default:
//                System.out.println("Default");
//        }

//        int i = 1,j = 10;
//        do {
//            if(i>j) {
//                break;
//            }
//            j--;
//        } while (++i <5);
//        System.out.println("i =" +i+" and j = "+j);

//        int sum=0;
//        for(int i=0,j=0;i<5&j<5;++i,j=i+1)
//            sum+=i;
//        System.out.println(sum);


//        for (int i =0; i <3; i++) {
//            switch(i) {
//                case 0: break;
//                case 1: System.out.print("one ");
//                case 2: System.out.print("two ");
//                case 3: System.out.print("three ");
//            }
//        } 		System.out.println("done");

        for (int i=0; i < 10; i +=2) {
            System.out.print(i+"");
            ++i;
        }

        int i = 1,j = -1;
        switch (i) {
            case 0, 1:
                j = 1;
            case 2:
                j = 2;
            default:
                j = 0;
        }
        System.out.println("j="+j);
    }
}
