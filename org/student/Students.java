package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
	}

	public static void main(String[] args) {
		Students info= new Students();
		info.getStudentInfo(6001);
		info.getStudentInfo(6001, "AARTHY");
		info.getStudentInfo("aarthyvalli@gmail.com",1234567890);
	}

}
