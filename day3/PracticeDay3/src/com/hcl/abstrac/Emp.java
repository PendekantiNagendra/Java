package com.hcl.abstrac;

/**
 * class Employ.
 *
 */

abstract class Emp {
  int empno;
  String name;
  double basic;

  @Override
  /* 
  *method.
  */ 
  
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  /* 
  *method Emp.
  */ 
  
  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
}
