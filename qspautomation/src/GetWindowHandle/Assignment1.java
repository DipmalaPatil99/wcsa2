//close the browser without quit method
package GetWindowHandle;


	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get("https://omayo.blogspot.com/");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//a[contains(text(),'Open')]"));
			String parentHandle = driver.getWindowHandle();
			System.out.println(parentHandle);
	        
			
			Set<String> allhandles = driver.getWindowHandles();
			for(String handle:allhandles)
			{
				driver.switchTo().window(handle);
				driver.close();
		    }
		}

	}



