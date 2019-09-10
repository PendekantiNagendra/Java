package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add(new Emp(1, "Nagendra", 45456.22));
    s.add(new Emp(2, "Sai", 456354.22));
    s.add(new Emp(3, "Rishab", 47698.22));
    s.add(new Emp(4, "Prem", 458758.22));
    s.add(new Emp(5, "Yash", 4568654.22));
    s.add(new Emp(6, "Ram", 4567634.22));
    System.out.println("Sorted Data");
    s.forEach(System.out::println);
  }
}
