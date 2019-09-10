package com.hcl.abstrac;

/**
 *class.
 *
 */

public class AbsDemo {
  /**
  *method.
  *
  */

  public static void main(String[] args) {
    Traing t1 = new Anubh();
    Traing t2 = new Saii();
    Traing[] arr = new Traing[] { new Anubh(), new Saii() };
    for (Traing t : arr) {
      t.name();
      t.email();
    }
  }
}
