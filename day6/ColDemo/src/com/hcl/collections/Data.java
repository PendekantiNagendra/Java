package com.hcl.collections;

class Data<T> {
  public void swap(T x, T y) {
    T t;
    t = x;
    x = y;
    y = t;
    System.out.println("X Value " + x + "Y Value " + y);
  }
}