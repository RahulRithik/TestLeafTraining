package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementImage {

	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/Image.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		//1
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]//img")).click();
	}

}
