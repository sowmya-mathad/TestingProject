package java17And21;

/**
 * Uncomment the line 6 while running the file
 **/
//import static java.lang.StringTemplate.STR;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

/**
 * Execute on command line with the command
 * java --source 21 --enable-preview AbsolutePath of file TemplateProcessorTest.java
 */
public class TemplateProcessorTest {
    private static String name = "JavaDZone";
    private String course = "Java21 Features";
    private static int a = 100;
    private static int b = 200;

    public static void main(String[] args) {

        // Using variable in template expression. uncomment below line
       //System.out.println(STR."Welcome to \{name}");

        // Utilizing a method in the template expression. uncomment below line
       // System.out.println(STR."Welcome to \{getName()}");


        TemplateProcessorTest st = new TemplateProcessorTest();

        // Using non-static variable in the template expression. uncomment below line
      //  System.out.println(STR."Welcome to \{st.course}");

        // Performing arithmetic operations within the expression. uncomment below line
     //   System.out.println(STR."\{a} + \{b} = \{a+b}");

        // Displaying the current date using expression uncomment below line
      //  System.out.println(STR."The current date is: \{DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())}");

    }


    public static String getName() {
        return name;
    }
}