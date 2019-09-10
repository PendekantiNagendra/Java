package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {
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
    lstEmploy.stream().filter(p -> p.basic >= 50000).forEach(x -> {
      System.out.println(x);
    });
    System.out.println("Name Starts with L");
    lstEmploy.stream().filter(p -> p.name.startsWith("L")).forEach(x -> {
      System.out.println(x);
    });
  }
}
