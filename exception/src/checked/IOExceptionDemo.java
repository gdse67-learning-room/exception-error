package checked;

/*
    @author DanujaV
    @created 9/18/23 - 11:39 AM   
*/

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        File file = new File("/dfdfd/abc.txt");

        try {
            boolean isCreated = file.createNewFile();
            if(isCreated) {
                System.out.println("file created!!!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("oopppsssss!!!!! something happened!!!!!");
        }

        System.out.println("End Main");
    }
}
