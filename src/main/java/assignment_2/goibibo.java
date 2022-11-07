package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gclid=Cj0KCQjw48OaBhDWARIsAMd966BguynH7EEwOdxDAJY5TNnpWVRZUQMJIQs4-RqBLZi0epxdAQwgG1caAk6mEALw_wcB");
        driver.findElement(By.xpath("(//span[@class=\"sc-bXTejn iajdYt\"])[3]")).click();
        driver.findElement(By.xpath("//p[@class='sc-giYglK eCwiKJ fswWidgetPlaceholder']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Delhi"+Keys.ENTER);
        
        driver.findElement(By.xpath("//div[@class='sc-efQSVx bUzoZw']")).click();
        

}
}