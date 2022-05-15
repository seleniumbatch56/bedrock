package handling_frames;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	
	WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void testFrameDemo() throws InterruptedException {

		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("packageFrame");
		
		WebElement frame = driver.findElement(By.xpath("//frame[contains(@title,'All classes and interfaces')]"));
		
		driver.switchTo().frame(frame);
		
		if(driver.findElements(By.linkText("AbstractAction")).size()!=0) {
			
			driver.findElement(By.linkText("AbstractAction")).click();
		
		}
		
		else {
			System.out.println("Element is not displayed");
		}
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(2);
		
		driver.switchTo().parentFrame();

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
