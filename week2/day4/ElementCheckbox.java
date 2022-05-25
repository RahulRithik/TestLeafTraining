package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheckbox {

	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		//1
		driver.findElement(By.xpath("(//div[@class='example'])[1]//input[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[1]//input[3]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[1]//input[5]")).click();
		
		//2
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])[2]//input")).isSelected());
		
		//3
		driver.findElement(By.xpath("(//div[@class='example'])[3]//input[2]")).click();

		//4
		List<WebElement> ele=driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
		for (int i = 0; i < ele.size(); i++) {
			 ele.get(i).click();
		}
	}

}
