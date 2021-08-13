package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win Handle : " + parentWin);
		driver.findElement(By.xpath("//button[contains(text(), 'Tab')]")).click();
		System.out.println("Current window : " + driver.getWindowHandle());
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Tabs : " + tabs.size());//2
		for (String childWin : tabs) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//span[contains(text(), 'Java')][1]")).click();
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		//New Popup Window
		driver.findElement(By.xpath("//button[contains(text(), 'new Window')]")).click();
		Set<String> wins = driver.getWindowHandles();
		for (String childWin : wins) {
			if(!childWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//button[contains(text(), 'New Message')]")).click();
			}
		}
//		driver.close();
		driver.quit();
	}

}
