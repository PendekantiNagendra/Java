package com.hcl.ex;

public class Quiz3 {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Employ[]arr = new Employ[] {
        new HrEmploy("Sagar"),
        new JavaEmploy("Niveditha"),
        new HrEmploy("Lakshmi"),
        new JavaEmploy("Gupta"),
        new HrEmploy("Pramod"),
        new JavaEmploy("Sakshi"),
        new HrEmploy("Aakash"),
        new JavaEmploy("Shafiq"),
        new JavaEmploy("Praveen"),
        new JavaEmploy("Sajid"),
        new HrEmploy("Vahid")
    };
    for (Employ employ : arr) {
      if (employ instanceof JavaEmploy){
        System.out.println(employ);
      }
    }
  }
}
