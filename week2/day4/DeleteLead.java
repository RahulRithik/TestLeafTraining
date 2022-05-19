package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		        //crmsfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				String textone=driver.getTitle();
				System.out.println(textone);
				
				//leads and find leads 
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.linkText("Phone")).click();
				driver.findElement(By.name("phoneNumber")).sendKeys("9566261627");
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
				Thread.sleep(5000);
				
     driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
     driver.findElement(By.linkText("Delete")).click();
     
     
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.name("id")).sendKeys("10588");
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
				//driver.close();
				



	}

}
