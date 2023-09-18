package unchecked;

/*
    @author DanujaV
    @created 9/18/23 - 11:54 AM   
*/

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int x = 10;

        System.out.print("Input a number: ");
        int y = new Scanner(System.in).nextInt();

        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
//            System.out.println("Hey user! you can't input 0 as a input");
        }

        System.out.println("End Main");
    }
}
