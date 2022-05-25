package org.student;

import org.department.Department;

public class Student extends Department {
 
	public void studentName() {
    	System.out.println("Rank"); 
     }
     
     public void studentDept() {
     	System.out.println("CSE"); 
      }
     
     public void studentId() {
     	System.out.println("79;=v"); 
      }
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.CollegeName();
		obj.CollegeCode();
		obj.CollegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
