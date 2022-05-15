package capturing_screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	@Test
	public void testDemo() throws InterruptedException, IOException {
		try {
			driver.findElement(By.linkText("Forgotten passwor")).click();
		}
		catch(Exception e) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");

			Date date = new Date();

			String currentDate = dateFormat.format(date);

			System.out.println(currentDate);


			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


			//File destination = new File("D:\\Batch 56\\Selenium\\Screenshots\\fbscreenshot.png");

			File destination = new File("D:\\Batch 56\\Selenium\\Screenshots\\"+currentDate+".png");

			FileUtils.copyFile(source, destination);
		}


	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
