package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailAddressOrPhoneNumber = driver.findElement(By.id("email"));

		emailAddressOrPhoneNumber.clear();

		emailAddressOrPhoneNumber.sendKeys("SeleniumBtach56");

		String enteredUserName = emailAddressOrPhoneNumber.getAttribute("value");

		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		//loginButton.click();
		
		loginButton.submit();

		Thread.sleep(10000);
		
		driver.close();

	}

}
