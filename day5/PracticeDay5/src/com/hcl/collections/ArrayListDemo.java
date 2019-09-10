package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List lstNames = new ArrayList();
    lstNames.add("Anubhav");
    lstNames.add("Vinod");
    lstNames.add("Prem");
    lstNames.add("Raghu");
    lstNames.add("Sai");
    lstNames.add("Ram");
    System.out.println("Names Are :");
    //for (Object object : lstNames) {
    //System.out.println(object);
    //}
    System.out.println("JDK 1.8");
    lstNames.forEach(System.out::println);
    /*Edit*/
    lstNames.set(1, "Vinod Kumar");
    System.out.println("Updated List");
    lstNames.forEach(System.out::println);
    System.out.println("List After Removing By Index...");
    lstNames.remove(1);
    lstNames.forEach(System.out::println);
  }
}
