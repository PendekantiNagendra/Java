package com.hcl.interfacedemo;

class Demo implements IFirst, ISecond, IThird {

  @Override
  public void name() {
    // TODO Auto-generated method stub
    IFirst.super.name();
    ISecond.super.name();
    IThird.super.name();
  }
}

