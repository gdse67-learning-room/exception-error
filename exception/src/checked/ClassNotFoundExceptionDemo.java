package checked;

/*
    @author DanujaV
    @created 9/18/23 - 12:22 PM   
*/

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Student.class");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
