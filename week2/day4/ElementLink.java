package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLink {

	public static void main(String[] args) {
		//download the driver and set the path
				WebDriverManager.chromedriver().setup();
				//launch the browser
				ChromeDriver driver=new ChromeDriver();
				//load the application url
				driver.get("http://www.leafground.com/pages/Link.html");
				//maximize the browser
				driver.manage().window().maximize();
				
				//1 
				driver.findElement(By.linkText("Go to Home Page")).click();
				driver.get("http://www.leafground.com/pages/Link.html");
				
	//2
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	}

}
