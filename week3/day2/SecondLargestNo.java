package week3.day2;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
    int[] arr= {36,462,455,33,875,368,33,55,33,987,543};
    Arrays.sort(arr);
    int no=arr.length-2;
    System.out.println(arr[no]);
	}

}
