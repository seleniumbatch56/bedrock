package xml_read;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	public WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeMethod
	public void setUp(String browser, String url) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\Batch 56\\Selenium\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@AfterMethod
	public void tearDown() {

		driver.quit();
	}


}
