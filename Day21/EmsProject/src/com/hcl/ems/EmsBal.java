package com.hcl.ems;

public class EmsBal {
	public static boolean LoginBal(int empId, String secretCode) {
		return new EmsDao().LoginDao(empId, secretCode);

	}

	 public static Employ MyAccountBal(int empId) {
		 return new EmsDao().MyAccountDao(empId);
	 }
}
