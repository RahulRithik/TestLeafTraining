package week1.day3;

public class Prime1 {
public static void main(String[] args) {
	int input=13;
	int count=0;
	for (int i = 1; i <=input; i++) {
		if(input%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("Given number is Prime");
	}else {
		System.out.println("Given number is not Prime");
	}
}
}