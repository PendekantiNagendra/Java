package com.hcl.enums;

public class Enum3 {

  /**
  * method.
  *
  */

  public static void show() {
    Student[] arrStudent = Student.values();
    for (Student student : arrStudent) {
      System.out.println(student);
    }
  }

  /**
  * main.
  *
  */
  
  public static void main(String[] args) {
    show();
  }
}
