package week4.day3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("override deposit money");
	}

	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
