package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    List<Product> list = new ArrayList<Product>();
    list.add(new Product(1, "HP Laptop", 42000));
    list.add(new Product(3, "Keyboard", 400));
    list.add(new Product(2, "Dell Mouse", 150));
    list.add(new Product(5, "Iphone 6s", 62000));
    list.add(new Product(4, "Sony Xperia", 45000));
    list.add(new Product(6, "Redmi4", 14150));
    list.stream().filter(p -> p.price >= 20000).forEach(x -> {
      System.out.println(x);
    });
    System.out.println("Name Starts with S");
    list.stream().filter(p -> p.name.startsWith("S")).forEach(x -> {
      System.out.println(x);
    });
    Product maxP = list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
    System.out.println("Max Price Record");
    System.out.println(maxP);
    Product minP = list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
    System.out.println("Min Price Record");
    System.out.println(minP);
  }
}
