package com.hcl.varars;

public class SupCon {
  /**
  * main..
  *
  */

  public static void main(String[] args) {
    Employ e1 = new Amit(1, "Amit", 458456);
    Employ e2 = new Vinod(3, "Vinod", 84546);
    System.out.println(e1);
    System.out.println(e2);
    Employ[] arr = new Employ[] { e1, e2 };
    for (Employ employ : arr) {
      System.out.println(employ);
    }
  }
}
