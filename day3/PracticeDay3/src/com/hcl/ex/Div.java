package com.hcl.ex;

public class Div {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    int a;
    int b;
    int c;
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = a / b;
      System.out.println("Division" + c);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero impossible");
    } catch (NumberFormatException e) {
      System.out.println("String can not be con as  int");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Args not found");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("Prog by HCl Participants");
    }
  }
}
