package handling_windows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

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
	public void testFrameDemo() throws InterruptedException {

		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();
		
		Thread.sleep(3000);

		WebElement termsLink = driver.findElement(By.linkText("Terms"));

		WebElement dataPolicyLink = driver.findElement(By.linkText("Data Policy"));

		WebElement cookiePolicyLink = driver.findElement(By.linkText("Cookie Policy"));

		termsLink.click();

		dataPolicyLink.click();

		cookiePolicyLink.click();

		Set<String> allHandles = driver.getWindowHandles();

		ArrayList<String> handles = new ArrayList<String>(allHandles);

		String signUpPage = handles.get(0);

		String termsPage = handles.get(1);

		String dataPolicyPage = handles.get(2);

		String cookiePolicyPage = handles.get(3);

		Thread.sleep(5000);

		driver.switchTo().window(termsPage);

		driver.switchTo().window(cookiePolicyPage);
		
		driver.switchTo().window(signUpPage);
		//Thread.sleep(5000);

		
		
		driver.switchTo().window(dataPolicyPage);


		
		
		Thread.sleep(5000);
		




	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
