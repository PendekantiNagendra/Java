package com.hcl.interfacedemo;

interface IFirst {
  default void name() {
    System.out.println("Name from IFirst..");
  }
}