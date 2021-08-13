package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		selectDate("2022", "March", "30");
	}
	public static String[] getMonthYear(String monthYearVal) {
		//[month, year]
		return monthYearVal.split(" ");
	}
	public static void selectDate(String expYear, String expMonth, String expDay) {
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("MonthYear Value : " + monthYearVal);
		if(expMonth.equalsIgnoreCase("February") && Integer.parseInt(expDay) > 29) {
			System.out.println("Trying to select wrong date : "+ expMonth +" "+ expDay);
		}
		while(!(getMonthYear(monthYearVal)[0].equals(expMonth) && getMonthYear(monthYearVal)[1].equals(expYear))){
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		//a[text()='19'])
		//"//a[text()='" + expDay+ "']"
		try {
			driver.findElement(By.xpath("//a[text()='"+ expDay + "']")).click();
		}
		catch(Exception ex) {
			System.out.println("Trying to select wrong date : "+ expDay);
		}
	}
}
