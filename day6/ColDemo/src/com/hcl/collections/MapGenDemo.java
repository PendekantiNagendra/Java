package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Map<Integer, String> m = new Hashtable<Integer, String>();
    m.put(1, "Vinod");
    m.put(2, "Prem");
    m.put(3, "Hema");
    m.put(4, "raghu");
    int key;
    String result;
    System.out.println("Enter Key");
    Scanner sc = new Scanner(System.in);
    key = sc.nextInt();
    result = m.getOrDefault(key, "Not Found...");
    System.out.println(result);
  }
}
