package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		option.setHeadless(true);
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Mens = driver.findElement(By.xpath("//a[text()='MEN']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(Mens).perform();
		driver.findElement(By.xpath("(//a[text()='Shirts'])[1]")).click();
		System.out.println("Passed");
	}
	}