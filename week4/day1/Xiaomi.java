package week4.day1;

public abstract class Xiaomi implements AndriodTvDesign {

	
    public void switchOn() {
		System.out.println("switch on tv");
		
	}

	public void changeChannel() {
		System.out.println("change channel");
		
	}

	public void lowerVolume() {
		System.out.println("lower the volume");
		
	}
	
	public abstract void enableWifi();

	public static void main(String[] args) {
		
	}
}
