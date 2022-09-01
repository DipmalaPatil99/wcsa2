package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     
	     WebElement searchBox = driver.findElement(By.className("q"));
	     
	     String attrvalue = searchBox.getAttribute("tittle");
	     System.out.println(attrvalue);

	}

}
