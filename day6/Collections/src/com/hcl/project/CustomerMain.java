package com.hcl.project;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
  private static int custId;
  private static Object objCustomer;
  /**
   * method.
   *
   */
  
  public static void deleteCustomer() {
    int custId;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter CustomerId  ");
    custId = sc.nextInt();
    CustomerBal obj = new CustomerBal();
    String res = obj.deleteCustomerBal(custId);
    System.out.println(res);
  }
  /**
  * method.
  *
  */
  
  public static void updateCustomer() {
    Customer objCustomer = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter CustomerId  ");
    objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
    System.out.println("Enter Customer Name  ");
    objCustomer.setCustName(sc.nextLine());
    System.out.println("Enter Annual Premium  ");
    objCustomer.setAnnualPremium(sc.nextDouble());
    System.out.println("Enter Modal Premium  ");
    objCustomer.setModalPremium(sc.nextDouble());
    System.out.println("Enter Payment Mode  ");
    objCustomer.setPaymentMode(sc.nextInt());
    CustomerBal obj = new CustomerBal();
    String res = obj.updateCustomerBal(objCustomer);
    System.out.println(res);
  }
  /**
  * method.
  *
  */
  
  public static void showCustomer() {
    CustomerBal obj = new CustomerBal();
    List<Customer> lstCustomer = obj.showCustomerBal();
    for (Customer customer : lstCustomer) {
      System.out.println(customer);
    }
  }
  /**
  * method.
  *
  */
  
  public static void searchCustomer() {
    int sno;
    System.out.println("Enter Customer Id  ");
    Scanner sc = new Scanner(System.in);
    custId = sc.nextInt();
    CustomerBal obj = new CustomerBal(); 
    Customer objStudent = obj.searchCustomerBal(custId);
    if (objCustomer != null) {
      System.out.println(objCustomer);
    } else {
      System.out.println("Record not found...");
    }
  }
  /**
  * method.
  *
  */
  
  public static void addCustomer() {
    ResourceBundle rb = ResourceBundle.getBundle("project");
    Customer objCustomer = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Customer Id  ");
    objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
    System.out.println("Enter Customer Name  ");
    objCustomer.setCustName(sc.nextLine());
    System.out.println("Enter Annual Premium  ");
    objCustomer.setAnnualPremium(sc.nextDouble());
    System.out.println("Enter Modal Premium  ");
    objCustomer.setModalPremium(sc.nextDouble());
    System.out.println("Enter Payment Mode  ");
    objCustomer.setPaymentMode(sc.nextInt());
    CustomerBal obj = new CustomerBal();
    try {
      boolean res = obj.addCustomerBal(objCustomer);
      if (res == true) {
        System.out.println("Customer Record Added");
      }
    } catch (CustomerException e) {
      System.out.println(e.getMessage());
    }
  }
  /**
  * main.
  *
  */
  
  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Options");
      System.out.println("---------");
      System.out.println("1. Add Customer");
      System.out.println("2. Show Customer");
      System.out.println("3. Search Customer");
      System.out.println("4. Update Customer");
      System.out.println("5. Delete Customer");
      System.out.println("6. Exit");
      System.out.println("Enter Ur Choice  ");
      ch = sc.nextInt();
      switch (ch) {
        case 1 : 
          addCustomer();
          break;
        case 2 :
          showCustomer();
          break;
        case 3 :
          searchCustomer();
          break;
        case 4 : 
          updateCustomer();
          break;
        case 5 : 
          deleteCustomer();
          break;
        case 6 : 
          return;
        default : 
          System.out.println("Invalid Choice");
      }
    } while (ch != 6);
  }
}
