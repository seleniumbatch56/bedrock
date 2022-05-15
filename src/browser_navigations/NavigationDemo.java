package browser_navigations;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
	
	WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().deleteCookieNamed("");
		
		

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void testDemo() throws InterruptedException {

		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPassword.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();

		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);
		
		
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
