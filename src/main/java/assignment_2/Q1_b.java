package assignment_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Q1_b {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","//C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		WebElement clk = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		clk.click();
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.dismiss();
		System.out.println("Dismissed");
		
	}

}


