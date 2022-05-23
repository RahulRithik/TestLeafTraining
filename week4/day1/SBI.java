package week4.day1;

public abstract class SBI implements CIBIL,PNB{

	public static void main(String[] args) {
		

	}

	public void ITLoan() {
		System.out.println("IT loan");
	}
	
	public abstract void maximumLoanAmount();
	
	public abstract void bankBalance();
	
	
}

