package week4.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> val=new HashSet<String>();
        
		//[apple, fig, grape, mango, orange] -- TreeSet output (ASCII ascending order)
		//[mango, orange, grape, apple, fig] -- LinkedHashSet output (input order)
        //[orange, apple, fig, grape, mango] -- HashSet(random manner)

        val.add("mango");
        val.add("orange");
        val.add("grape");
        val.add("apple");
        val.add("fig");
        val.add("fig");
        val.add("orange");
        val.add("grape");
        
        System.out.println(val);
        
        boolean var=val.add("kiwi");
        System.out.println(var);
        
        boolean var1=val.add("kiwi");
        System.out.println(var1);
        
	}
     
}
