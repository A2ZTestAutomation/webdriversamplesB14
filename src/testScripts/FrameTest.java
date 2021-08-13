package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chercher.tech/practice/frames");
		driver.manage().window().maximize();
		WebElement label = driver.findElement(By.xpath("//label/span"));
		System.out.println("Label Text : "+ label.getText());
		//MainPage to frame1
		driver.switchTo().frame("frame1");
//		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");
		//Frame1 to frame3
		driver.switchTo().frame("frame3");
//		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//From Frame3 back to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		
		//From frame1 back to mainpage
		driver.switchTo().defaultContent();
		System.out.println("Again get Label : "+ driver.findElement(By.xpath("//label/span")).getText());
		
		driver.switchTo().frame("frame2");
		
		
		driver.close();
	}

}
