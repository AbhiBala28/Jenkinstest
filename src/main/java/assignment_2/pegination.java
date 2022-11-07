package assignment_2;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class pegination {
	public WebDriver driver;

@Test
public void a() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}
	public void page1() {
			WebElement p1 = driver.findElement(By.xpath("//input[@id='alertbtn']"));
			p1.click();
			WebElement p2 = driver.findElement(By.xpath("//a[@role='button']"));
			driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
			p1.click();
			
		}
	public void page2() {
		//a[@role='button']
		WebElement clk = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		clk.click();
		WebElement run = driver.findElement(By.xpath("//a[@role='button']"));
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
	}
	
}
