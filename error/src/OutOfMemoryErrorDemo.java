/*
    @author DanujaV
    @created 9/18/23 - 10:45 AM   
*/

class Db {
    long[] ar = new long[100000];

    {
        System.out.println(this);
    }
}

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        Db[] obj = new Db[10000];

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Db();
        }
    }
}
