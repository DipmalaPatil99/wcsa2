package methodOfWebDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {

	public static void main(String[] args) {
	

	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension targetSize = new Dimension(100,600);
		driver.manage().window().setSize(targetSize);

	}

}
