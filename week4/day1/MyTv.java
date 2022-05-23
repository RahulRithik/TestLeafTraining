package week4.day1;

public class MyTv extends Xiaomi{

	@Override
	public void enableWifi() {
    System.out.println("enable the wifi");		
	}
	
	public static void main(String[] args) {
        MyTv obj=new MyTv();
       obj.switchOn();
       obj.changeChannel();
       obj.lowerVolume();
       obj.enableWifi();
	}

}
