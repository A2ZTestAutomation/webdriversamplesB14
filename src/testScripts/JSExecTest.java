package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String strTitle = js.executeScript("return document.title").toString();
		System.out.println("Page Title : "+ strTitle);
		
//		driver.findElement(By.name("search")).sendKeys("Phone");
		
		WebElement searchbox = (WebElement)js.executeScript("return document.getElementsByName('search')[0]");
//		searchbox.sendKeys("Phone");
//		driver.findElement(By.className("input-group-btn")).click();
//		
////		js.executeScript("window.scrollBy(500, 900)");
//		
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
//		js.executeScript("history.go(-1)");
		
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		js.executeScript("document.querySelector('#datepicker1').value='30/07/2021'");
		

	}

}
