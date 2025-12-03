package ch01.ex01file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class app {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("/Users/kunwoopark/WS/java-study/javaprj/res/test.txt"); 
        fos.write('A');
        fos.write('H');
        fos.write('E');
        fos.write('L');
        fos.write('L');
        fos.write('O');
        fos.write('!');
        fos.write('\n');
        fos.flush();
        fos.close();
        System.out.println("작업완료");
  }

}

