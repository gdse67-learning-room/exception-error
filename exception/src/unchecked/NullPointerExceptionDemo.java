package unchecked;

/*
    @author DanujaV
    @created 9/18/23 - 12:27 PM   
*/

import java.util.Random;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
//        Random rand = new Random();

        Random rand = null;
        try {
            System.out.println(rand.nextInt(100));
        } catch (NullPointerException e) {
            System.out.println("oops!");
        }
    }
}
