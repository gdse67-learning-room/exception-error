package finallyy;

/*
    @author DanujaV
    @created 9/18/23 - 1:53 PM   
*/

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        int x = 10;

        System.out.print("Input the number: ");

        try {
            int y = new Scanner(System.in).nextInt();

            int result = x / y;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("What ever happened, I don't care");
        }

    }
}
