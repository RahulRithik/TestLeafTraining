package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementEdit {

	public static void main(String[] args) {
		        //download the driver and set the path
				WebDriverManager.chromedriver().setup();
				//launch the browser
				ChromeDriver driver=new ChromeDriver();
				//load the application url
				driver.get("http://www.leafground.com/pages/Edit.html");
				//maximize the browser
				driver.manage().window().maximize();
				
				
				System.out.println(driver.getTitle());
				
				System.out.println(driver.getCurrentUrl());
				
				//System.out.println(driver.getPageSource());
				//1
				driver.findElement(By.id("email")).sendKeys("rahulrithik6@gmail.com");
				//3
				System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
				//4
				driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[4]//input")).clear();
		 //5
		 System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]//input")).isEnabled());
		 //2
		 driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]//input")).sendKeys("edit key"+"\n");
				
	}

}
