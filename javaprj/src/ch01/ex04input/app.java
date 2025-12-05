package ch01.ex04input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class app {
  public static void main(String[] args) throws IOException {
    int kor1 = 0;
    int kor2 = 0;
    int kor3 = 0;

    //----------성적 로드 --------------
    FileInputStream fis = new FileInputStream("/Users/kunwoopark/WS/java-study/javaprj/res/kors.txt");
    Scanner scan = new Scanner(fis);

    kor1 = scan.nextInt(); // 85
    kor2 = scan.nextInt(); // 90
    kor3 = scan.nextInt(); // 100
    kor1++;

    scan.close();
    fis.close();

    //----------성적 입력 --------------

/*    int code = fis.read();

    System.out.println(code); // 56 -> "56"
    System.out.printf("%c\n",code);
    System.out.write(code);
    System.out.println();*/

    Scanner scanner = new Scanner(System.in);
    System.out.print("kor1: ");
    kor1 = scanner.nextInt();
    System.out.print("kor2: ");
    kor2 = scanner.nextInt();
    System.out.print("kor3: ");
    kor3 = scanner.nextInt();

    scanner.close();

    //----------성적 저장 --------------

    System.out.println("=======================");

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

    //----------성적 출력 --------------

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
