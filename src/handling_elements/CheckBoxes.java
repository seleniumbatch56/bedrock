package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/checkboxes");

		WebElement checkbox1 = driver.findElement(By.xpath("//h3[text()='Checkboxes']/following::form/input[1]"));

		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.xpath("//h3[text()='Checkboxes']/following::form/input[2]"));
		System.out.println("Status of checkbox2 is: "+ checkbox2.isSelected());

		Thread.sleep(5000);

		driver.quit();



	}

}
