package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement from=driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		
//		driver.findElement(By.id("txtStationFrom")).clear();
//		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		
		WebElement to=driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("DLI",Keys.ENTER);
	
		
//		driver.findElement(By.id("txtStationTo")).clear();
//		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		
	driver.findElement(By.id("chkSelectDateOnly")).click();
		
	List<WebElement> ele=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
	int size=ele.size();
	List<String> trainName=new ArrayList<String>();
	System.out.println("row count"+size);
	for(int i=0;i<ele.size();i++) {
		String text = ele.get(i).getText();
		System.out.println(text);
		
		
		trainName.add(text);
	}
	Collections.sort(trainName);
	System.out.println(trainName);

	}

}