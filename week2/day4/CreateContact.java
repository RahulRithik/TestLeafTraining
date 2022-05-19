package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		        //crmsfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				String textone=driver.getTitle();
				System.out.println(textone);
				
				//create contact
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				
				//filling details
				driver.findElement(By.id("firstNameField")).sendKeys("Rahul");
				driver.findElement(By.id("lastNameField")).sendKeys("M");
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rithik");
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
				driver.findElement(By.id("createContactForm_description")).sendKeys("creating contacts using selenium");
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer science");
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rahulrithik666@gmail.com");
				
				WebElement statedropdown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select obj1=new Select(statedropdown);
				obj1.selectByVisibleText("Florida");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				//edit contact
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateContactForm_description")).clear();
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("creating contact for clients");
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				String text = driver.getTitle();
				System.out.println(text);
	
	}

}
