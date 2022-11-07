package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoqa {
	public WebDriver driver;
	
	@BeforeMethod
	public void Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
	}
	
	@Test
	public void Url() {
		String a = "https://demoqa.com/";
		Assert.assertEquals(a,driver.getCurrentUrl());
	}
	
	@Test
	public void BookDisplay() {
		WebElement book = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
		System.out.println("Display");
		Assert.assertEquals(book,driver.getCurrentUrl());
		String b ="Book";
		
	}
}
