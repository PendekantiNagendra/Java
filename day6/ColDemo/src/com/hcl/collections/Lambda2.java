package com.hcl.collections;

public class Lambda2 {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    IHello h1 = () -> {
      System.out.println("Hello From Rishab...");
    };
    IHello h2 = () -> {
      System.out.println("Hello From Laksh...");
    };
    IHello h3 = () -> {
      System.out.println("Hello From Lakshmi...");
    };
    IHello[] arr = new IHello[]{h1, h2, h3};
    for (IHello ihello : arr) {
      ihello.sayHello();
    }
    ICalc ad1 = (a,b)  -> {
      System.out.println("Sum");
      return a + b; 
    };
    ICalc ad2 = (a,b) -> (a - b);
    ICalc ad3 = (a,b) -> (a * b);
    System.out.println(ad1.calc(12, 5));
    System.out.println(ad2.calc(3, 9));
    System.out.println(ad3.calc(65, 8));
    h1.sayHello();
    h2.sayHello();
    h3.sayHello();
  }
}
