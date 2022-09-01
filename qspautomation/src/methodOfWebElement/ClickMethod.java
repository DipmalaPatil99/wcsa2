package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Admin/OneDrive/Desktop/HTML/Flipkartlink.html");
		   WebElement link1 = driver.findElement(By.partialLinkText("flip"));
		   link1.click();
		   
	}

}
