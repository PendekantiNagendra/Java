package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    int accountNo = AccountBal.generateAccountBal();
    //System.out.println(accountNo);
    Accounts objAccounts = new Accounts();
    objAccounts.setAccountNo(accountNo);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Name");
    objAccounts.setFirstName(sc.nextLine());
    System.out.println("Enter Last Name");
    objAccounts.setLastName(sc.nextLine());
    System.out.println("Enter City Name");
    objAccounts.setCity(sc.nextLine());
    System.out.println("Enter State Name");
    objAccounts.setState(sc.nextLine());
    System.out.println("Enter Amount ");
    objAccounts.setAmount(sc.nextInt());
    System.out.println("Enter CheqFacil");
    objAccounts.setCheqFacil(sc.next());
    System.out.println("Enter Account Type");
    objAccounts.setAccountType(sc.next());
    System.out.println(AccountBal.createAccountBal(objAccounts));
  }
}
