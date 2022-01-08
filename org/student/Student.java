package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("AARTHY");
	}
	public void studentDept() {
		System.out.println("ELECTRONICS");
	}
	public void studentId() {
		System.out.println("6001");
	}

	public static void main(String[] args) {
		Student info=new Student();
		info.studentName();
		info.studentDept();
		info.studentId();
		info.deptName();
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
	}

}
