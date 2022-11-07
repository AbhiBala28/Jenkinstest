package assignment_1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","//C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        
	}

}
