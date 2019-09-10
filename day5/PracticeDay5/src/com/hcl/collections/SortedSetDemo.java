package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add("Vinod");
    s.add("Hema");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    System.out.println("Sorted Data");
    s.forEach(System.out::println);
  }
}
