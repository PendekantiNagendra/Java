package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(42));
    lstData.add(new Integer(19));
    lstData.add(new Integer(13));
    lstData.add(new Integer(24));
    lstData.add(new Integer(65));
    lstData.add(new Integer(17));
    lstData.stream().limit(3).forEach(p -> {
      System.out.println(p);
    });
    System.out.println("After Skipping 2 Records");
    lstData.stream().skip(2).forEach(p -> {
      System.out.println(p);
    });
    System.out.println("Filtered Data");
    lstData.stream().filter(p -> p > 15).forEach(x -> {
      System.out.println(x);
    });
  }
}
