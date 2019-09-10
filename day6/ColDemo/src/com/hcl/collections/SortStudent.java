package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Comparator<Student> c = new CgpComparator();
    Set<Student> setStudent = new TreeSet<Student>(c);
    setStudent.add(new Student("Ram", "Divya", "Bangalore", 4.5));
    setStudent.add(new Student("Sai", "Laksh", "Bangalore", 6.5));
    setStudent.add(new Student("Prem", "Vinod", "Bangalore", 7.5));
    setStudent.add(new Student("Sai", "Raghu", "Bangalore", 8.5));
    setStudent.add(new Student("Sri", "Prem", "Bangalore", 9.5));
    System.out.println("Student List");
    setStudent.forEach(System.out::println);
  }
}
