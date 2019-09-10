package com.hcl.assertion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/objout.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      Student s = new Student(1, "Nagendra", "Bangalore", 8.5);
      objout.writeObject(s);
      objout.close();
      fout.close();
      System.out.println("Student Stored...");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
