package week3.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
   String text1="Stops";
   String text2="Potss";
   
   int length1=text1.length();
   int length2=text2.length();
 
   if(length1==length2) 
  {
	
  String one=text1.toLowerCase();
  String two=text2.toLowerCase();
 
  System.out.println(one);
  System.out.println(two);
  
  char[] arr=one.toCharArray();
  System.out.println(arr);
  
  char[] arr1=two.toCharArray();
  System.out.println(arr1);
  
 Arrays.sort(arr);
 Arrays.sort(arr1);
 
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }
 
 for(int j=0;j<arr1.length;j++) {
	 System.out.println(arr1[j]);
 }
 
 boolean compare=Arrays.equals(arr,arr1);
 if(compare==true) {
	 System.out.println("It's an Anagram");
 }
 else {
	 System.out.println("It's not an Anagram");
 }
  }
   
  else {
	  System.out.println("It's not Anagram");
  }

   }

}
