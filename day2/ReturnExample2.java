package week1.day2;

public class ReturnExample2 {
	 public float add(float a,float b) {
		 float c=a+b;
		 System.out.println(c);
		 return c;
	 }

	 public void sub(double c,double d) {
		 double e=c-d;
		 System.out.println(e);
	 }
	 
	public static void main(String[] args) {
		ReturnExample2 ret=new ReturnExample2();
		float x=ret.add(50.1f,50.3f);
		ret.sub(x,99.37);
	}

}
