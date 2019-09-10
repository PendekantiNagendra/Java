package com.hcl.interfacedemo;

class Test implements IOne, ITwo {

  @Override
  public void email() {
    // TODO Auto-generated method stub
    System.out.println("Email hcl@gmail.com");
  }

  @Override
  public void name() {
    // TODO Auto-generated method stub
    System.out.println("Company HCL");
  }
}