package week3.day5;

public class FindRepeatedLetter {

	public static void main(String[] args) {
		String str="testleaf";
		char [] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]=='e') {
				count=count+1;
			}}
			System.out.println(count);
	}
}