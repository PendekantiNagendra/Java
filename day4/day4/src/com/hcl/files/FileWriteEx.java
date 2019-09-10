package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * class.
 *
 */

public class FileWriteEx {
  /**
   * main.
   *
   */

  public static void main(String[] args) {
    File src;
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("C:/hcljava/day4/day4/src/com/hcl/ex/Email.java");
    tar = new File("c:/files/Custom.java");
    try {
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) {
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
      System.out.println("***File Copied***");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

