package com.hcl.collections;

/**
 * class SwapDemo.
 *
 */

public class SwapDemo {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Data obj = new Data();
    int x;
    int y;
    x = 12;
    y = 13;
    obj.swap(x, y);
    double b1 = 12.5;
    double b2 = 77.6;
    obj.swap(b1, b2);
    String s1 = "Hello";
    String s2 = "World";
    obj.swap(s1, s2);
    boolean f1 = true;
    boolean f2 = false;
    obj.swap(f1, f2);
  }
}

