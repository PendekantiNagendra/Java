package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(42));
    lstData.add(new Integer(13));
    lstData.add(new Integer(18));
    lstData.add(new Integer(22));
    lstData.add(new Integer(15));
    int sum;
    lstData.forEach(p -> {
      if (p >= 15) {
        System.out.println(p);
      }
    });
  }
}
