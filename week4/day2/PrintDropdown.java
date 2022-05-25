package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintDropdown {

	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='example'][6]//option"));
		
		for(int i=0;i<ele.size();i++) {
			String text =ele.get(i).getText();
			System.out.println(text);
		}
		
	}

}
