package assignment_2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhijeet Bala\\eclipse-workspace\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/?utm_source=affyguru_846_104&utm_campaign=FROM_VENDOR&utm_content=affyguru_846_101");
        driver.findElement(By.xpath("(//input[@name=\"keyword\"])[1]")).sendKeys("iphone");
       
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        
        
        WebElement element = driver.findElement(By.id("//span[@class='lfloat product-price']"));
        String text = element.getText();
        
        
}
//
//	private static void browser() {
//		// TODO Auto-generated method stub
//		
//	}
}