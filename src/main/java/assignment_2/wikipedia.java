package assignment_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        List<WebElement> lang = driver.findElements(By.xpath("//div[@class=\"central-featured\"]//strong"));
        System.out.println(lang.size());
        for(int i=0;i<lang.size();i++) {
        	System.out.println(lang.get(i).getText());
        }
//        System.out.println(lang);
        
	}
}
