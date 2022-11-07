package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// date selector in calander.
public class DemoDate {
	public WebDriver driver;
	
	@Test
	public void Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");
        driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"));
        Select month = new Select(driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--selected-month']")));
	}
	
}