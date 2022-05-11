package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login 
		driver.findElement(By.id("email")).sendKeys("rahul.rasher.14@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("xxxxxxxxxxxx");
		driver.findElement(By.name("login")).click();
		
	}

}
