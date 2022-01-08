package org.college;

public class College {
	public void collegeName() {
		System.out.println("Name of the college:SREC");
	}
	public void collegeCode() {
		System.out.println("college code:4123");
	}
	public void collegeRank() {
		System.out.println("rank:5");
	}

	public static void main(String[] args) {
		System.out.println("college details");
		College details=new College();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
	}

}
