package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListExample {

	public static void main(String[] args) {
         List<Integer> val=new ArrayList<Integer>();
         
         val.add(1);
         val.add(8);
         val.add(3);
         val.add(9);
         val.add(2);
         val.add(6);
         val.add(4);
         val.add(7);
         val.add(10);
         val.add(5);
         
         System.out.println(val);
         
         
//          int size=val.size();
//         for(int i=0;i<size;i++) {
//        	 Integer var=val.get(i);
//        	 System.out.println(var);       	 
//         }
        
       
         Collections.sort(val);
         System.out.println(val);
         
        
         Collections.reverse(val);
         System.out.println(val);
         
         for(Integer var1:val) {
            System.out.println(var1);
              }
         
	}

}
