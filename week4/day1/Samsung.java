package week4.day1;

public class Samsung implements AndriodDesign,SamsungDesign {

	
    public void startPhone() {
		System.out.println("start phone");
	}

	public void makeCall() {
		System.out.println("make call");
		
	}

	public void sendSms() {
		System.out.println("send sms");
		
	}
	
	public void samsungNote() {
		System.out.println("samsung note");
	}
	
	public static void main(String[] args) {
       Samsung obj=new Samsung();
       obj.startPhone();
       obj.makeCall();
       obj.sendSms();
       obj.samsungNote();
    	  
	}

	public void faceAuthentication() {
		System.out.println("face authentication");		
	}

	public void samsungGalaxy() {
		System.out.println("samsung galaxy");		
	}

}
