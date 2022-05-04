package week1.day2;

public class ArithmeticOperations {
	public void add() {
		int a=5;
		int b=7;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=5;
		int b=7;
		int c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int a=5;
		int b=7;
		int c=a*b;
		System.out.println(c);
	}
	public void div() {
		int a=35;
		int b=7;
		int c=a/b;
		System.out.println(c);
	}


	public static void main(String[] args) {
		ArithmeticOperations arithmetics=new ArithmeticOperations();
		arithmetics.add();
		arithmetics.sub();
		arithmetics.mul();
		arithmetics.div();
	}

}
