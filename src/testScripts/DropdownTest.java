package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html
		driver.manage().window().maximize();
		Select singleSel = new Select(driver.findElement(By.id("select-demo")));
		singleSel.selectByVisibleText("Monday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(1);
			mulSel.selectByValue("New York");
			mulSel.selectByVisibleText("Texas");
			System.out.println("No of selected Items : "+mulSel.getAllSelectedOptions().size());
//			mulSel.deselectByIndex(1);
			
			
			
			
		}
		

	}

}
