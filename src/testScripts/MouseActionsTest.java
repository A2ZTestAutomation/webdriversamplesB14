package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
//		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//		WebElement btn = driver.findElement(By.xpath("//button[contains(text(), 'Double')]"));
////		actions.doubleClick(btn).perform();
//		
//		
//		actions.doubleClick(btn).doubleClick(btn).build().perform();
//		
//		actions.contextClick(btn).perform();
////		
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(), 'Components')][1]"));
		//a[contains(text(), 'Monitors (2)')]
		WebElement item = driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]"));
		actions.moveToElement(menu).click(item).build().perform();

	}

}
