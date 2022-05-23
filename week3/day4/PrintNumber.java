package week3.day4;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
       String text="Amazon has more than 17,865 employees in chennai";
       String text1="testleaf";
       String word="i like chicken briyani";
       
      //print digits
       String replace = text.replaceAll("\\D","");
       System.out.println(replace);
       
       //print vowels
       for(int i=0;i<text1.length();i++) {
    	   if(text1.charAt(i)=='a'||text1.charAt(i)=='e'||text1.charAt(i)=='i'||text1.charAt(i)=='o'||text1.charAt(i)=='u')
    	
    	    System.out.println(text1.charAt(i));
        	}
    	
        
      // print number of words
       String[] ans = word.split(" ");
       System.out.println(ans.length);
	}

}
