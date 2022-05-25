package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListExample2 {

	public static void main(String[] args) {
		List<String> val=new ArrayList<String>();
        
        val.add("Aspire Systems");
        val.add("HCL");
        val.add("Wipro");
        val.add("CTS");
        
        System.out.println(val);
        
        Collections.sort(val);
        System.out.println(val);
        
        Collections.reverse(val);
        System.out.println(val);

            
	}

}
