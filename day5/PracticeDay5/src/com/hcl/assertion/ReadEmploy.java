package com.hcl.assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {

  /**
  * main.
  *
  */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("c:/files/objout.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Employ e = (Employ)objin.readObject();
      System.out.println(e);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
