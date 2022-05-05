package week1.day3;

public class Prime {
	public static void main(String[] args) {
		int n=11;
		boolean num=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				num=false;
				break;
			}
			
	}
		System.out.println(num);

}}