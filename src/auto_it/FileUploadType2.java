package auto_it;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadType2 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://smallpdf.com/jpg-to-pdf");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void demo() throws InterruptedException, IOException {

		if(driver.findElements(By.xpath("//span[text()='Got it']")).size()!=0) {
			driver.findElement(By.xpath("//span[text()='Got it']")).click();
		}
		
		WebElement selectFile = driver.findElement(By.xpath("//span[text()='Choose Files']"));

		selectFile.click();
		Thread.sleep(8000);
		
		Runtime.getRuntime().exec("D:\\Batch 53\\Selenium\\AutoIT\\FileUpload.exe");

		Thread.sleep(6000);

	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();
	}

}
