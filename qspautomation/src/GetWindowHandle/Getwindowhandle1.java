package GetWindowHandle;


	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Getwindowhandle1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get("https://omayo.blogspot.com/");
			 driver.findElement(By.xpath("//a[contains(text(),'Open')]"));
			String parentHandle = driver.getWindowHandle();
			System.out.println(parentHandle);
	        
			
			Set<String> allhandles = driver.getWindowHandles();
			for(String handle:allhandles)
			{
				System.out.println(handle);
			}
		}

	}



