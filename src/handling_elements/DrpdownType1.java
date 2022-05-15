package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrpdownType1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		WebElement titleDropDown = driver.findElement(By.xpath("//div[text()='Select Title']"));
		
		titleDropDown.click();
		
		WebElement profOption = driver.findElement(By.xpath("//div[text()='Prof.']"));
		
		profOption.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
