package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * class.
 *
 */
public class ArrayIntEx {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List num = new ArrayList();
    num.add(new Integer(44));
    num.add(new Integer(54));
    num.add(new Integer(33));
    num.add(new Integer(12));
    num.add(new Integer(86));
    int sum = 0;
    for (Object ob : num) {
      sum += (Integer)ob; 
    }
    System.out.println("Sum is :" + sum);
  }
}
