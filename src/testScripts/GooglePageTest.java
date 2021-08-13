package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.get("https://www.google.co.in/");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("Java Tutorial");
////		searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
		
		//Using Navigation API
		driver.navigate().to("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		
//		searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
//		System.out.println("Page Title after Search : "+driver.getTitle());
//		driver.navigate().back();
//		System.out.println("Page Title of Home Page : "+driver.getTitle());
//		driver.navigate().forward();
//		System.out.println("Current URL : "+ driver.getCurrentUrl());
//	
		List<WebElement> eList = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		for(int i = 0; i < eList.size(); i++) {
			System.out.println(eList.get(i).getText());
			if(eList.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
				eList.get(i).click();
				break;
			}
		}
	}

}
