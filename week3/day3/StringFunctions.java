package week3.day3;

public class StringFunctions {

	public static void main(String[] args) {
     //lowercase
	 String name="RAHUL";
     String lowercase=name.toLowerCase();
     System.out.println(lowercase);
	
	//uppercase
     String name1="book";
     String uppercase=name1.toUpperCase();
     System.out.println(uppercase);
	
     //concat
     String name2="work";
     String name3="bench";
     String concat=name2.concat(name3);
     String concat1=name2.concat(" ").concat(name3);
     System.out.println(concat);
     System.out.println(concat1);

	//replace
     String name4="APPLE";
     String replace=name4.replace("P","b");
     System.out.println(replace);
     
     //replaceall
     String name5="Rahul272@& Rithik256@";
     String replace1=name5.replaceAll("\\D","");
     System.out.println(replace1);
	
     //substring
     String name6="Rahul272@&Rithik256@";
     String substring=name6.substring(1,10);
     System.out.println(substring);
	
     //split
     String name7="Testleaf is located in nanganalur";
     String[] value=name7.split("l");
     
     for(int i=0;i<value.length;i++) {
    	 System.out.println(value[i]);
     }
     
    
	
	}
	

}
