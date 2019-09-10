package com.hcl.ex;
/**
 * class ThrEx.
 *
 */

public class ThrExc {
  /**
  * method show.
  *
  */

  public void show(int x) {
    boolean flag = true;
    if (x < 0) {
      flag = false;
      throw new NumberFormatException("Negative Number Not Allowed");
    }
    if (x == 0) {
      flag = false;
      throw new ArithmeticException("Zero is Invalid...");
    }
  }
  /**
   *main.
   *
   */
  
  public static void main(String[] args) {
    int n = -12;
    try {
      new ThrExc().show(n);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
