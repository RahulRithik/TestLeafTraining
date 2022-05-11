package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//login
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
                driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("27/04/1999");
                driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
                driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("12345");
                driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("rithik");
                driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("93 jayalakshmi apts");
                driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("canal bank road");
                driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
                driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600035");
                driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("144");

                
				WebElement sourcedropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select obj1=new Select(sourcedropdown);
				obj1.selectByVisibleText("Employee");
				
				WebElement campaigndropdown=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select obj2=new Select(campaigndropdown);
				obj2.selectByVisibleText("Pay Per Click Advertising");
				
				WebElement currencydropdown=driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select obj3=new Select(currencydropdown);
				obj3.selectByVisibleText("INR - Indian Rupee");
				
				WebElement industrydropdown=driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select obj4=new Select(industrydropdown);
				obj4.selectByVisibleText("Health Care");
				
				WebElement ownershipdropdown=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select obj5=new Select(ownershipdropdown);
				obj5.selectByVisibleText("S-Corporation");
				
				WebElement statedropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select obj6=new Select(statedropdown);
				obj6.selectByVisibleText("Hawaii");
				
				
				WebElement countrydropdown=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select obj7=new Select(countrydropdown);
				obj7.selectByVisibleText("India");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				String texttwo=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
				System.out.println(texttwo);

	}

}
