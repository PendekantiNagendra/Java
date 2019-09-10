package com.hcl.ex;

public class Quiz4 {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Object[] arr = new Object[] { 11, "Ram", 12.5, "Welcome", true, 125};
    for (Object object : arr) {
      if (object instanceof Integer) {
        System.out.println(object);
      }
      if (object instanceof String) {
        System.out.println(object);
      }
    }
  }
}