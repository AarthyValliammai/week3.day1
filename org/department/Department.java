package org.department;

import org.college.College;

public class Department extends College{
	public void deptName() {
		System.out.println("electronics");
	}

	public static void main(String[] args) {
		Department dept=new Department();
		dept.deptName();
	}

}
