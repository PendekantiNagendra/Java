package com.hcl.ex; 

class InvalidEmailException extends Exception {

  public InvalidEmailException(String error) {
    super(error);
  }
}