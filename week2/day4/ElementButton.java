package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementButton {

	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/Button.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		//1
		driver.findElement(By.id("home")).click();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//2
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//3
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));

		//4
		System.out.println(driver.findElement(By.id("size")).getSize());

	}

}
