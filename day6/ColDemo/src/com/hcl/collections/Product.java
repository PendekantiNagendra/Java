package com.hcl.collections;

public class Product {
  int id;
  String name;
  double price;

  /**
  * method.
  *
  */
 
  public Product(int id, String name, double price) {
    super();
    this.id = id;
    this.name = name;
    this.price = price;
  }
  
  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
  }
}
