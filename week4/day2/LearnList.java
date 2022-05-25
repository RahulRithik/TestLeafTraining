package week4.day2;

import java.util.List;
import java.util.ArrayList;

public class LearnList {

	public static void main(String[] args) {
          List<String> val=new ArrayList<String>();
          
          val.add("mango");
          val.add("orange");
          val.add("grape");
          val.add("apple");
          val.add("fig");
          val.add("fig");
          val.add("orange");
          val.add("grape");
          
          System.out.println(val);
         
          int size=val.size();
          System.out.println(size);

          boolean var=val.contains("apple");
          System.out.println(var);
          
          String var3=val.get(0);
          System.out.println(var3);
          
          String var1=val.remove(0);
          System.out.println(var1);
          
          val.remove(1);
          System.out.println(val);
          
          val.removeAll(val);
         System.out.println(val);
	}

}
