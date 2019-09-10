package com.hcl.varars;




public class InhDemo {
  /**
  * main..
  *
  */

  public static void main(String[] args) {
    Second sec = new Second();
    sec.show();

    First obj = new Second();
    obj.show();

    First f1 = (First) obj;
    obj.show();
  }
}
