package unchecked;

/*
    @author DanujaV
    @created 9/18/23 - 12:34 PM   
*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String s1 = "Kamal";
        String s2 = "Saman";

        /*String s1 = "10";
        String s2 = "20";*/

        try {
            int total = Integer.parseInt(s1) + Integer.parseInt(s2);
            System.out.println(total);
        } catch (NumberFormatException e) {
            System.out.println("Wrong inputs");
        }
    }
}
