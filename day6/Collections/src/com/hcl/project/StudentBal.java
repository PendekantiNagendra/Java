package com.hcl.project;

import java.util.List;

public class StudentBal {
	static StringBuilder sb = new StringBuilder();
	public boolean addStudentBal(Student objStudent) throws StudentException {
		boolean isAdded = true;
		if(objStudent.getSno() <= 0) {
			sb.append("Student No Can Not be Negative or Zero \r\n");
			isAdded = false;
		}
		if(objStudent.getName().length() <= 3) {
			sb.append("Name More Than 3 Characters \r\n");
			isAdded = false;
		}
		if(objStudent.getCity().length() <= 3) {
			sb.append("City More Than 3 Characters \r\n");
			isAdded = false;
		}
		if(objStudent.getCgp() <= 0) {
			sb.append("Cgp Non Negative \r\n");
			isAdded = false;
		}
		if(isAdded == false) {
			throw new StudentException(sb.toString());
		} else {
			(new StudentDao()).addStudent(objStudent);
		}
		return isAdded;
	}
	public Student searchStudentBal(int Sno) {
		return new StudentDao().searchStudentDAO(Sno);
	}
	public List<Student> showStudentBal() {
		return new StudentDao().showStudentDAO();
	}
	public String updateStudentBal(Student objStudent) {
		return new StudentDao().updateStudentDAO(objStudent);
	}
	public String deleteStudentBal(int sno) {
		return new StudentDao().deleteStudentDAO(sno);
	}

}
