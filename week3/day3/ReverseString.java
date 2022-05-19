package week3.day3;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
    String name= "Rahul";
    char[] arr=name.toCharArray();
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.println(arr[i]);    }
	}

}
