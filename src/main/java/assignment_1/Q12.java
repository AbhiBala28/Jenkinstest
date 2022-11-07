package assignment_1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q12 {

	    public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to("http://demo.automationtesting.in/Register.html");
	        WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	        firstname.sendKeys("Abhijeet");
	        WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	        lastname.sendKeys("Bala");
	        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	        email.sendKeys("abhi@gmail.com");
	        driver.findElement(By.name("signup")).click();

	    }
}
