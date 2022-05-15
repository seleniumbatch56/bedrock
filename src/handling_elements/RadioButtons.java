package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();
		
		Thread.sleep(3000);

		WebElement femaleRadioButton = driver.findElement(By.xpath("//span[1]/input"));

		System.out.println("female Radio Button is clicked: " + femaleRadioButton.isSelected());

		femaleRadioButton.click();
		Thread.sleep(3000);

		System.out.println("female Radio Button is clicked: " + femaleRadioButton.isSelected());

		WebElement maleRadioButton = driver.findElement(By.xpath("//span[2]/input"));

		System.out.println("Male Radio Button is clicked: " + maleRadioButton.isSelected());

		maleRadioButton.click();

		System.out.println("Male Radio Button is clicked: " + maleRadioButton.isSelected());

		Thread.sleep(5000);
		
		driver.quit();

	}

}
