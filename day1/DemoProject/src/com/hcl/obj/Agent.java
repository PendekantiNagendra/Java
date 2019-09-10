package com.hcl.obj;

public class Agent {
	public StringBuilder show(String agentId, String fullName, int maritalStatus, String zipCode) {
		StringBuilder sbError = new StringBuilder();
		boolean isValid = true;
		if ((agentId.charAt(0)) != 'A') {
			sbError.append("Agent Id Strat with 'A' " + "\r\n");
			isValid = false;
		}
		fullName = fullName.trim();
		if (fullName.indexOf(" ") == -1) {
			sbError.append("Full Name should contain FirstName and LastName " + "\r\n");
			isValid = false;
		}
		if (fullName.length() > 20) {
			sbError.append("Full Name should be less than 20 characters" + "\r\n");
			isValid = false;
		}
		if (maritalStatus != 0 && maritalStatus != 1) {
			sbError.append("please provide Marital Status " + "\r\n");
			isValid = false;
		}
		if (zipCode.length() != 6) {
			sbError.append("Zip Code length should be 6 characters" + "\r\n");
			isValid = false;
		}
		if (isValid == true) {
			sbError.append("Agent Id " + agentId + "\r\n");
			sbError.append("Name " + fullName + "\r\n");
			sbError.append("Marital Status " + maritalStatus + "\r\n");
			sbError.append("Zip Code " + zipCode + "\r\n");
		}
		return sbError;

	}

	public static void main(String[] args) {
		int married = 1;
		String agentId = "A12";
		String fullName = "Nag";
		String zipCode = "234225";
		StringBuilder sbRes = new Agent().show(agentId, fullName, married, zipCode);
		System.out.println(sbRes);
	}

}
