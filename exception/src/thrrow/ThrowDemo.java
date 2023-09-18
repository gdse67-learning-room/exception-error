package thrrow;

/*
    @author DanujaV
    @created 9/18/23 - 2:21 PM   
*/

import java.util.Scanner;

public class ThrowDemo {
    private static void isEligibleForTheVote(int age) {
        if(age >= 18) {
            System.out.println("You are eligible for the vote!");
        } else {
            throw new IllegalArgumentException("You are so dumb!");
//            System.err.println("You are so small person!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        isEligibleForTheVote(age);
    }
}
