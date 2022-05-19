package week3.day2;

public class PrintDuplicate {

	public static void main(String[] args) {
    int[] arr= {2,4,3,5,2,8,54,5,67,1,67};
    for(int i=0;i<arr.length;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			System.out.println(arr[i]);
    		}
    	}
    }
	}

}
