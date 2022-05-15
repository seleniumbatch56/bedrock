package handling_keyboardevents;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
	
	WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void testDemo() throws InterruptedException {

		WebElement emailField = driver.findElement(By.id("email"));
		
		Actions action = new Actions(driver);
		
		//action.keyDown(Keys.SHIFT).sendKeys(emailField, "seleniumbatch").keyUp(Keys.SHIFT).sendKeys(emailField,"56").build().perform();
		//sendKeys("Seleniumbatch56").perform();
		
		action.sendKeys(emailField, "selenium").sendKeys(emailField, Keys.BACK_SPACE).build().perform();

		Thread.sleep(5000);
		
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
