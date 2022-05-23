package week3.day4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String nextLine=sc.nextLine();
		
		String replace = nextLine.replaceAll("\\D","");
	       System.out.println(replace);
	       
	  
		
		
	}

}
