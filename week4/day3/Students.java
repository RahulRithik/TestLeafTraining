package week4.day3;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("student id"+id);
	}
	
    public void getStudentInfo(int id,String name) {
    	System.out.println("student id"+id+" "+"student name"+" "+name);
	}
    
    public void getStudentInfo(String email,long phoneNumber) {
    	System.out.println("student email"+email+" "+"student phoneNumber"+" "+phoneNumber);
	}

	
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(101);
		obj.getStudentInfo(101,"rahul");
		obj.getStudentInfo("rahulrithik6@gmail.com",9566285162L);
		
	}

}
