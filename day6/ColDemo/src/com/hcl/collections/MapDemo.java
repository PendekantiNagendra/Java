package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Map m = new HashMap();
    m.put("Priya", "Darshini");
    m.put("Laksh", "Laksh");
    m.put("Rishab", "HCL");
    m.put("Kirumba", "Lakshmi");
    String key = "Laksh";
    String value = (String)m.getOrDefault(key, "Not Found");
    System.out.println(value);
  }
}
