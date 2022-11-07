//Q3.
//Test Case:- To find system user is present in admin section
//Steps to Automate:
//1. Open link https://opensource-demo.orangehrmlive.com/
//2. Login with username and password
//3. Click on Admin
//4. Enter system user details
//5.Click on search

package assignment_3;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sa1 {
	 static WebDriver driver;

	    @BeforeClass
	    public void initialize() {
	        ChromeOptions chromeOptions = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(chromeOptions);
	    }
	    
	    public void userRegistration() {
	        driver.get("http://automationpractice.com/index.php");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	        WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
	        signInBtn.click();
	        
	        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='email_create']"));
	        emailTextBox.sendKeys("abhijeet123@gmail.com");
	        
	        WebElement createAccountBtn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
	        createAccountBtn.click();
	        
	        
	    }
	    public void searchProduct() {
	        
	    }
	    @Test()
	    public void adminSection() {
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	        userName.sendKeys("Admin");
	        
	        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	        password.sendKeys("admin123");
	        
	        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        loginBtn.click();
	        
	        WebElement adminDetails = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
	        adminDetails.click();
	        
	        WebElement userNameTextBox = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	        userNameTextBox.sendKeys("Abhi");
	        
	        WebElement userRoleBtn = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
	        userRoleBtn.click();
	        
	        List<WebElement> userRole = driver.findElements(By.xpath("//div[@role='option']"));
	        System.out.println(userRole.size());
	        userRole.get(1).click();
	        
	        WebElement statusBtn=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
	        statusBtn.click();
	        
	        List<WebElement> status= driver.findElements(By.xpath("//div[@role='option']"));
	        status.get(2).click();
	        
	        WebElement empDetails = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	        empDetails.sendKeys("Abhijeet");
	        
	        WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        searchBtn.click();
	        }
	 
	    
	    @AfterClass
	    public void close() {
	        //driver.close();
	    }

	}