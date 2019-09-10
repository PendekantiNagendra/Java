package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1, "Divya", 45987));
    lstEmploy.add(new Employ(2, "Laksh", 45621));
    lstEmploy.add(new Employ(3, "Vinod", 98742));
    lstEmploy.add(new Employ(4, "Raghu", 95321));
    lstEmploy.add(new Employ(5, "Prem", 98745));
    System.out.println("Employ List");
    lstEmploy.forEach(System.out::println);
  }
}
