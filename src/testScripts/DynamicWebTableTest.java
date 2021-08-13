package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableTest {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Anandhi/CourseMaterials/DemoHTMLFiles/WebTable.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(), 'Keyboard')]//preceding-sibling::td//input[@type='checkbox']")).click();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("F:\\Screenshot\\Screenshot28Jul21.png"));
	}

}
