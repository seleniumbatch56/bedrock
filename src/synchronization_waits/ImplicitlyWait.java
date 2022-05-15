package synchronization_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();
		//Thread.sleep(3000);
		
		
		
		
		
		//WebElement femaleRadioButton = driver.findElement(By.xpath("//span[1]/input"));
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement femaleRadioButton = driver.findElement(By.xpath("//span[1]/input"));
		

		wait.until(ExpectedConditions.elementToBeClickable(femaleRadioButton));
		femaleRadioButton.click();
		//WebElement femaleRadioButton = driver.findElement(By.xpath("//span[1]/input"));
		//System.out.println("female Radio Button is clicked: " + femaleRadioButton.isSelected());

		//femaleRadioButton.click();

	}

}
