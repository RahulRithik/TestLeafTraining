package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//find username and type value in textbox(login)
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//after login,click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		String textone=driver.getTitle();
		System.out.println(textone);
		
		//after crmsfa link clicking, click lead 
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		//creating lead by filling details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rahul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rithik");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rahulrithik6@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		
		//editing the created lead
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JOHN");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("WICK");
		driver.findElement(By.id("createLeadForm_annualRevenue")).clear();
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("900000");
		driver.findElement(By.className("smallSubmit")).click();
			
	}

}
