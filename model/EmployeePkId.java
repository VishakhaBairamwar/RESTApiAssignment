package com.BikkadIT.model;

import java.io.Serializable;


public class EmployeePkId  implements Serializable{
	
	
	private int empId;
	
	
	
	private int deptId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


}
