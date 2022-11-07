package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","//C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement input_b = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        input_b.sendKeys("To The New");
        WebElement btn = driver.findElement(By.xpath("//input[@value='Google Search']"));
        btn.click();
        
        
	}

}
