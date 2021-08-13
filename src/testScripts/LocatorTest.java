package testScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorTest {
	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("chrome.switches", "--disable-extentions");
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.findElement(By.id("fname")).sendKeys(Keys.chord(Keys.SHIFT,"ab"));

		driver.findElement(By.id("fname")).sendKeys(Keys.PAGE_DOWN);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("idOfButton"))));
		
		boolean isButton = driver.findElement(By.id("idOfButton")).isDisplayed();
		System.out.println("Is Button Displayed : "+isButton);
		driver.findElement(By.id("idOfButton")).click();
		driver.findElement(By.id("male")).click();
		boolean isGenderSel = driver.findElement(By.name("gender")).isSelected();
		System.out.println("Gender Selected / not : "+ isGenderSel);
//		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.cssSelector("input#male")).click();
		driver.findElement(By.cssSelector(".Automation")).click();
	
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		for (WebElement element : elements) {
			System.out.println("Name Attribute  : " + element.getAttribute("name"));
			
		}
//		driver.findElement(By.linkText("This is a link")).click();
//		driver.findElement(By.partialLinkText("This is ")).click();
		System.out.println("After Navigation : "+driver.getTitle());
		
		//input[@type='text']//following::button
		List<WebElement> eList = driver.findElements(By.xpath("//input[@type='text']//following::button"));
		System.out.println(eList.size());
		for (WebElement item : eList) {
			System.out.println(item.getText());
		}
		//button[@id='idOfButton']//preceding::input
		driver.findElement(By.id("fname")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		
	}
	
	
}
