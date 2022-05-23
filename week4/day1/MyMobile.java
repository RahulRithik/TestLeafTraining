package week4.day1;

public class MyMobile {

	public static void main(String[] args) {
      Samsung sam=new Samsung();
      
      sam.startPhone();
      sam.makeCall();
      sam.sendSms();
      sam.samsungNote();
      sam.faceAuthentication();
      sam.samsungGalaxy();
      
      AndriodDesign design=new Samsung();
      design.startPhone();
      design.sendSms();
      
      SamsungDesign obj=new Samsung();
      obj.faceAuthentication();
      obj.samsungGalaxy();
      
	}

}
