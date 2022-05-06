package week1.day4;

public class SumofDigits {

	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		int remainder;
		while(n>0) {
			remainder=n%10;
			sum=sum+remainder;
			n=n/10;
		}
		System.out.println(sum);
	}

}
