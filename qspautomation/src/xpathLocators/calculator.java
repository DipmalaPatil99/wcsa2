package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='–']")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		String result2 = driver.findElement(By.id("sciOutPut")).getText();
        System.out.println(result2);
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='×']")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		String result3 = driver.findElement(By.id("sciOutPut")).getText();
        System.out.println(result3);
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='/']")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		String result4 = driver.findElement(By.id("sciOutPut")).getText();
        System.out.println(result4);
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
