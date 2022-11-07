package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
        WebElement contact= driver.findElement(By.xpath("(//a[text()='contact us'])[2]"));
        contact.click();
        
        driver.navigate().back();
        driver.findElement(By.id("h-contact-us"));
        

	}

}
