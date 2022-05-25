package week4.day3;

public class MethodOverLoadingStudent {

	
	public void getStudentDetail(String name) {
		System.out.println("Student name:"+name);
	}
	
	public void getStudentDetail(String name,int studentId) {
		System.out.println("Student name:"+name+" "+"student id:"+studentId);
	}
	
	public void getStudentDetail(int studentId,String name) {
		System.out.println("student id:"+studentId+" "+"Student name:"+name);
	}
    
	public void getStudentDetail(String name,long mobileNumber) {
		System.out.println("Student name:"+name+" "+"mobileNumber"+mobileNumber);
	}
	
	public void getStudentDetail(String name,int studentId,String address) {
		System.out.println("Student name:"+name+" "+"studentid:"+studentId+" "+"address:"+address);
	}
	
	public static void main(String[] args) {
		MethodOverLoadingStudent student=new MethodOverLoadingStudent();
		student.getStudentDetail("rahul");
		student.getStudentDetail(11, "rahul");
		student.getStudentDetail("rahul", 11);
		student.getStudentDetail("rahul", 9064736987L);
		student.getStudentDetail("rahul", 11, "xxxyyyzzz");
		
     }
}