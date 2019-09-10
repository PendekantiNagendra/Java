package com.hcl.project;

import java.util.List;

public class CustomerBal {
  static StringBuilder sb = new StringBuilder();
  /**
  * method.
  *
  */
  
  public boolean addCustomerBal(Customer objCustomer) throws CustomerException {
    boolean isAdded = true;
    if (objCustomer.getCustId() <= 0) {
      sb.append("Customer Id Can Not be Negative or Zero \r\n");
      isAdded = false;
    }
    if (objCustomer.getCustName().length() <= 5) {
      sb.append("Name More Than 5 Characters \r\n");
      isAdded = false;
    }
    if (objCustomer.getAnnualPremium() <= 20000) {
      if (objCustomer.getAnnualPremium() >= 100000) {
        sb.append("Annual Premium between 20000 and 100000 \r\n");
        isAdded = false;
      }
    }
    if (objCustomer.getModalPremium() <= 1000) {
      if (objCustomer.getModalPremium() >= 50000) {
        sb.append("Modal Premium between 1000 and 50000 \r\n");
        isAdded = false;
      }
    }
    if (objCustomer.getPaymentMode() != 1) {
      if (objCustomer.getPaymentMode() != 2) {
        if (objCustomer.getPaymentMode() != 3) {
          sb.append("Payment Mode \r\n");
          isAdded = false;
        }
      }
    }
    if (isAdded == false) {
      throw new CustomerException(sb.toString());
    } else {
      (new CustomerDao()).addCustomer(objCustomer);
    }
    return isAdded;
  }
  
  public Customer searchCustomerBal(int custId) {
    return new CustomerDao().searchCustomerDao(custId);
  }

  public List<Customer> showCustomerBal() {
    return new CustomerDao().showCustomerDao();
  }

  public String updateCustomerBal(Customer objCustomer) {
    return new CustomerDao().updateCustomerDao(objCustomer);
  }

  public String deleteCustomerBal(int sno) {
    return new CustomerDao().deleteCustomerDao(sno);
  }
}
