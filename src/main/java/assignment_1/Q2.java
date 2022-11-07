package assignment_1;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Abhijeet Bala\\Downloads\\IEDriverServer_Win32_4.5.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
        
	}

}
