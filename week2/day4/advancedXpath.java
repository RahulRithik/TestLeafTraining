package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advancedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//login using xpath command
		//driver.findElement(By.xpath("//input[@id='password']//preceding::input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("//input[@id='username']//following::input[1]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//label[text()='Password']//following::input[2]")).click();
		
	}

}
