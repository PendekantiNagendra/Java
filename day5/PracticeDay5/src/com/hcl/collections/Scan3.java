package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("c:/files/data.txt");
      fw.write("12 ram 12.5 22 6 34.6 true Priya" + "false 33 1.5 anand Prem 4.6");
      fw.close();
      FileReader fr = new FileReader("c:/files/data.txt");
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        if (sc.hasNextInt()) {
          System.out.println(sc.nextInt());
        } else {
          sc.next();
        }
      }
      sc.close();
      fr.close();
      fw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
