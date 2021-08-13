package remoteScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriverTest {

	public static void main(String[] args) throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		String strHub = "http://192.168.1.7:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(strHub), options);
		
		driver.get("https://www.google.co.in/");
	  	WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title : " + driver.getTitle());
	}

	//http://192.168.1.7:4444/wd/hub
	
	//java –jar selenium-server-standalone-3.141.59.jar –role hub
	
	//java –Dwebdriver.chrome.driver=”chromedriver.exe” –jar selenium-server-standalone-3.141.59.jar –role node –hub http://192.168.1.7:4444/grid/register/
}
