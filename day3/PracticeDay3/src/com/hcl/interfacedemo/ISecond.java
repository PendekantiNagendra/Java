package com.hcl.interfacedemo;

interface ISecond {
  default void name() {
    System.out.println("Name from ISecond..");
  }
}
