package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		
		//forgottenPasswordLink.click();
		
									//or
		
		WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("Forgot"));
		
		forgottenPasswordLink.click();
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
