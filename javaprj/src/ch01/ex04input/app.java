package ch01.ex04input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class app {
  public static void main(String[] args) throws IOException {
    int kor1 = 85;
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

    int total = kor1 + kor2 + kor3;
    float avg = total / 3.0f; 

    System.out.println("--------------------------------");
    System.out.println("|            성적표            |");
    System.out.println("--------------------------------");

    System.out.printf("kor1 :%10d(%1$x)\n", kor1);
    System.out.printf("kor2 :%d\n", kor2);
    System.out.printf("kor3 :%-10d(%x)\n", kor3, kor3);
    System.out.printf("total :%10d\n", total);
    System.out.printf("avg :%6.2f\n", avg);
  }
}
