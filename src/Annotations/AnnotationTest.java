package Annotations;

public class AnnotationTest {
    public static void main(String args[]) {
        Testing1 testing1 = new Testing1();
        if(testing1.getClass().isAnnotationPresent(CustomAnnotation1.class))
            System.out.println("Present");
//       Present System.out.println(testing1.getClass().);
    }
}

@CustomAnnotation1("sowmya")class Testing1 {}
class Testing2 {}