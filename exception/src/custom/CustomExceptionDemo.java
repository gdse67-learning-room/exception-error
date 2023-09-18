package custom;

/*
    @author DanujaV
    @created 9/18/23 - 2:41 PM   
*/

import java.util.Scanner;

public class CustomExceptionDemo {
    private static void isEligibleForTheVote(int age) throws AreYouCrazyException {
        if(age >= 18) {
            System.out.println("You are eligible for the vote!");
        } else {
            throw new AreYouCrazyException("Not a suitable argument");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            isEligibleForTheVote(age);
        } catch (AreYouCrazyException e) {
            e.printStackTrace();
        }
    }
}
