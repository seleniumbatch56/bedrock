package junit_demohandling_alerts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void forgottentPassword() throws InterruptedException {

		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.submit();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		//System.out.println(al.getText());
		
		al.dismiss();
		
	
		

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
