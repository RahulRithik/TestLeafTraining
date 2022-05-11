package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("rahul");
		driver.findElement(By.name("lastname")).sendKeys("rithik");
		driver.findElement(By.name("reg_email__")).sendKeys("rahulrithik6@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("PAssword");
		
		WebElement dropdown1=driver.findElement(By.id("day")); 
		Select dayobj=new Select(dropdown1);
		dayobj.selectByValue("27");
		
		WebElement dropdown2=driver.findElement(By.id("month")); 
		Select monobj=new Select(dropdown2);
		monobj.selectByValue("4");
		
		WebElement dropdown3=driver.findElement(By.id("year"));
		Select yearobj=new Select(dropdown3);
		yearobj.selectByValue("1999");
		
		
	}

}
