package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementRadio {

	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/radio.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		//1
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]//input[1]")).click();

		//2
		System.out.println(driver.findElement(By.xpath("//input[@name='news'][2]")).isSelected());
		
		//3
		System.out.println(driver.findElement(By.className("myradio")).isSelected());
	}

}
