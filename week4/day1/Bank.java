package week4.day1;

public class Bank extends SBI {

	public void cibilScore() {
          System.out.println("cibil score");		
	}

	public void creditScore() {
        System.out.println("credit score");		
		
	}

	public void minimumBalance() {
        System.out.println("minimum balance");		
		
	}

	@Override
	public void maximumLoanAmount() {
        System.out.println("maximum loan amount");		
		
	}

	@Override
	public void bankBalance() {
        System.out.println("bank balance");		
		
	}
	
	public static void main(String[] args) {
        Bank obj=new Bank();
        obj.cibilScore();
        obj.creditScore();
        obj.maximumLoanAmount();
        obj.minimumBalance();
        obj.ITLoan();
        obj.bankBalance();
	}
}
