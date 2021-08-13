package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message : "+alert.getText());
		alert.accept();
		
		//Confirmation Alert
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][1]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("confirm Message : "+confirm.getText());
		confirm.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[contains(text(), 'Prompt Box')]")).click();
		
		Alert prompt = driver.switchTo().alert();
		System.out.println("prompt Message : "+prompt.getText());
		prompt.sendKeys("Hello Welcome");
		prompt.accept();
		
	}

}
