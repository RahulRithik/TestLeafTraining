package week4.day5;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	Employee(){
		System.out.println("default constructor");
	}
	Employee(int empId,String empName,String empAddress){
		
		this();

		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
	}
	public static void main(String[] args) {
		Employee emp=new Employee(101, "rahul", "Chennai");
		
		  System.out.println(emp.empId);
		  System.out.println(emp.empName);
		  System.out.println(emp.empAddress);
		 
		 
		
			}
}