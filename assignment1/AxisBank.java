package week3.assignment1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank info=new AxisBank();
		info.deposit();
		info.saving();
		info.fixed();
	}
    public void deposit() {
    	System.out.println("deposit a lesser amount");
    }
}
