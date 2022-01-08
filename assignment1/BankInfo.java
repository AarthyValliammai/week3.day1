package week3.assignment1;

public class BankInfo {
	public void saving() {
		System.out.println("create a savings account");
	}
	public void fixed() {
		System.out.println("fixed deposit");
	}
	public void deposit() {
		System.out.println("deposited amount:10000");
	}

	public static void main(String[] args) {
		BankInfo details=new BankInfo();
		details.saving();
		details.fixed();
		details.deposit();
	}

}
