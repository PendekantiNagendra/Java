package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
  /**
  * method.
  *
  */

  public static void main(String[] args) {
    List lstEmploy = new ArrayList();
    lstEmploy.add(new Employ(1, "Nagendra", 54789.22));
    lstEmploy.add(new Employ(2, "Ram", 25698.34));
    lstEmploy.add(new Employ(3, "Sai", 456981.26));
    lstEmploy.add(new Employ(4, "Rishab", 98542.22));
    lstEmploy.add(new Employ(5, "Prem", 52569.22));
    for (Object object : lstEmploy) {
      Employ e = (Employ)object;
      System.out.println(e);
    }
  }
}
