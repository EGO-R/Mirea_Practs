package Pract18;
import java.util.Scanner;
public class Exception3 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
