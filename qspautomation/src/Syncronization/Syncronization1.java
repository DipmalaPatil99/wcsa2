package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://bhushan/login.do");
		String LoginPageTitle = driver.getTitle();
		if(LoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page title is verified | test case is passed");
		}
		else
		{
			System.out.println("Login page title is not verified | test case is not passed");
		}
		
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.titleContains("Dipmala"));
		
		System.out.println("Home page is verified|Test case is passed");
		

	}

}
