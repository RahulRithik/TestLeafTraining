package week1.day2;

public class Variables {
	String text="testleaf";
	String book;
	boolean isVariables;
	double value;
	char c;
	public void add() {
		int a=10;
		System.out.println(a);
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Variables var=new Variables();
		System.out.println(var.text);
		System.out.println(var.book);
		System.out.println(var.isVariables);
		System.out.println(var.value);
		System.out.println(var.c);
		var.add();
	}

}
