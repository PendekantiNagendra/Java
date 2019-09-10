package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Comparator<Employ> c = new NameComparator();
    Set<Employ> setEmploy = new TreeSet<Employ>(c);
    setEmploy.add(new Employ(1, "Divya", 45987));
    setEmploy.add(new Employ(2, "Laksh", 45621));
    setEmploy.add(new Employ(3, "Vinod", 98742));
    setEmploy.add(new Employ(4, "Raghu", 95321));
    setEmploy.add(new Employ(5, "Prem", 98745));
    System.out.println("Employ List");
    setEmploy.forEach(System.out::println);
  }
}
