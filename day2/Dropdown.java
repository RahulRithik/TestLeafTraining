package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		//download the driver and set the path
				WebDriverManager.chromedriver().setup();
				//launch the browser
				ChromeDriver driver=new ChromeDriver();
				//load the application url
				driver.get("http://www.leafground.com/pages/Dropdown.html");
				//maximize the browser
				driver.manage().window().maximize();
				
				//dropdown example
		    
				WebElement eledropdown1 = driver.findElement(By.id("dropdown1"));
				Select obj = new Select(eledropdown1);
				//obj.selectByVisibleText("Selenium");
				//obj.selectByIndex(3);
				obj.selectByValue("4");

			

	}

}
