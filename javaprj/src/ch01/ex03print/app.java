package ch01.ex03print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class app {
  public static void main(String[] args) throws IOException {
    int kor1 = 80;
    int kor2 = 90;
    int kor3 = 100;

    FileOutputStream fos = new FileOutputStream("/Users/kunwoopark/WS/java-study/javaprj/res/kors.txt"); 
    PrintStream out = new PrintStream(fos);

    out.print(kor1);
    out.print(" ");

    out.print(kor2);
    out.print(" ");

    out.print(kor3);
    out.print(" ");


    out.close();
    fos.close();

    System.out.print(kor1);
    System.out.print(" ");

    System.out.print(kor2);
    System.out.print(" ");

    System.out.print(kor3);
    System.out.print(" ");
  }
}
