package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText2 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/OneDrive/Desktop/HTML/Flipkartlink.html");
	
	driver.findElement(By.partialLinkText("flip")).click();

    }
}