package week4.day3;

public class MethodOverridingAxisBank extends MethodOverridingRBI {
     
	public void savings() {
		System.out.println("overridded savings account");
	}
	
	public static void main(String[] args) {
		MethodOverridingAxisBank obj=new MethodOverridingAxisBank();
		obj.savings();
		obj.deposit();
	
	}

}
