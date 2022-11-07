package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q2_b {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","//C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_b1= driver.findElement(By.xpath("//input[@value='radio1']"));
		radio_b1.click();
		System.out.println("Button 1 Clicked");
		WebElement drop_1 = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		drop_1.click();
		System.out.println("dropdown run");
		WebElement drop_select = driver.findElement(By.xpath("//option[@value='option2']"));
		drop_select.click();
		System.out.println("option selected");
	}

	
}
