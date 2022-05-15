package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownType2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();

		Thread.sleep(3000);

		WebElement yearDropdown = driver.findElement(By.id("year"));

		Select year = new Select(yearDropdown);

		//year.selectByIndex(30);

		//year.selectByValue("1992");

		year.selectByVisibleText("1992");

		System.out.println("Year dropdown is Multi dropdown: "+year.isMultiple());


		WebElement selectedOption = year.getFirstSelectedOption();

		System.out.println("Selected Option is: "+selectedOption.getText());

		System.out.println("***********************************");

		List<WebElement> allOptions = year.getOptions();

		for(int i=0; i<allOptions.size(); i++) {

			System.out.println(allOptions.get(i).getText());
		}

		System.out.println("***********************************");
		System.out.println("All Options are: ");

		for(WebElement options:allOptions) {

			System.out.println(options.getText());

		}

		driver.findElement(By.partialLinkText("Cookie"));
		Thread.sleep(5000);

		driver.quit();

	}

}
