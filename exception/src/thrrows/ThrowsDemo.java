package thrrows;

/*
    @author DanujaV
    @created 9/18/23 - 2:04 PM   
*/

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {
    public static void createNewFile() throws IOException {    //Danuja
        //since JDK11
        var file = new File("abc.txt");
        file.createNewFile();   //IOException
    }

    public static void sithara() {
        try {
            createNewFile();
        } catch (IOException e) {
            System.out.println("Oh god!!!!");
        }
    }

    public static void thisanga() {
        try {
            createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void chathumini() {
        try {
            createNewFile();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {

    }
}
