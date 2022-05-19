package week3.day1;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {

		int[] arr= {4,8,56,43,26,78,90,22,55,44,78,65};
		Arrays.sort(arr);
		int length=arr.length;
		for(int i=length-1;i>=0;i--) {
			System.out.print(arr[i]+",");
		}
	}
}
