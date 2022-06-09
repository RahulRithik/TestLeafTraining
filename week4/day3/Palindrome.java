package week4.day3;

public class Palindrome {

	public static void main(String[] args) {
		
		    String name= "madam";
		    String reverse="";
		    char[] arr=name.toCharArray();
		    for(int i=arr.length-1;i>=0;i--) {
		    	reverse=reverse+name.charAt(i);
		    	
		    }
		    if(reverse.equals(name)) {
		     System.out.print("the given string"+" "+name+" "+"is palindrome");
		    }
		    else {
		    	System.out.print("the given string"+" "+name+" "+"is not palindrome");
		    }
		    
		   
			}
   
         
	
	}


