package com.hcl.ex;

public class ArrExc {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    int[] a = new int[]{12,5};
    try {
      a[10] = 77;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
