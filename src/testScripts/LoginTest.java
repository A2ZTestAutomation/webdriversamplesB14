package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches", "--disable-extentions");
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Anandhi/CourseMaterials/DemoHTMLFiles/LoginForm.html");
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("HelloUser");
//		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("HelloUser");
		driver.findElement(By.xpath("//input[@type='text' and @class='inputtext']")).sendKeys("HelloUser");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("welcome123");
		//input#pwd
		//input.password
		//input[name=password]
		//input[@id='pwd']
		//input[@class='password']
		//input[@id='pwd' or @class='password']
		//tagname[@attributename=attributevalue]
		driver.findElement(By.xpath("//input[@name='continue' and @type='submit']")).click();
	
		//button[contains(text(), 'Redirect')]
		driver.findElement(By.xpath("//button[contains(text(), 'Redirect')]")).click();
		//button[contains(text(), 'Submit')] - <button>Submit the Form</button>
		
	
		driver.findElement(By.xpath("//a[starts-with(@name,'Google')]")).click();
		
		//P101_item10
//		P101_item11
		//P101_item11
	}

}
