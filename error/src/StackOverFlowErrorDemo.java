/*
    @author DanujaV
    @created 9/18/23 - 10:34 AM   
*/

public class StackOverFlowErrorDemo {
    private static void xyz() {
        System.out.println("xyz");
        abc();
    }

    private static void abc() {
        System.out.println("abc()");
        xyz();
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        abc();
        System.out.println("End Main");
    }
}
