package com.hcl.ex;
/**
 *class Email.
 *
 */

public class Email {
  /**
  * method.
  *
  */
 
  public void checkEmail(String email) throws InvalidEmailException, InvalidUsernameException {
    boolean flag = true;
    String userName;
    int i = email.indexOf("@");
    if (i == -1) {
      flag = false;
      throw new InvalidEmailException("Invalid Email");
    }
    userName = email.substring(0,i);
    if (userName.length() > 12) {
      flag = false;
      throw new InvalidUsernameException("Invalid User");
    }
    if (flag == true) {
      System.out.println("Valid Email");
    }
  }
  /**
   *main.
   *
   */
  
  public static void main(String[] args) {
    String email = "nagendra@gmail.com";
    try {
      new  Email().checkEmail(email);
    } catch (InvalidEmailException | InvalidUsernameException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
