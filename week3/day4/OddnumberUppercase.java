package week3.day4;

public class OddnumberUppercase {

	public static void main(String[] args) {
      String text="welcome";
      char [] arr=text.toCharArray();
      for(int i=0;i<arr.length;i++) {
    	  if(i%2!=0) {
    		  System.out.println(Character.toUpperCase(arr[i]));
    	  }
    	  else {
    		  System.out.println(Character.toLowerCase(arr[i]));
    	  }
      }
	}

}
