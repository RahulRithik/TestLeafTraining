package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		
		String input = "babub";
		
		char [] arr=input.toCharArray();
		System.out.println(arr);
		
		Set<String> var=new HashSet<String>();
		
		var.add("b");
		var.add("a");
		var.add("b");
		var.add("u");
		var.add("b");
		
		System.out.println(var);
		
		var.remove("b");
		
		System.out.println(var);
}

}
