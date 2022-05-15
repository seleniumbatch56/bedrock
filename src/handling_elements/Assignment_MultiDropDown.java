package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_MultiDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		if(driver.findElements(By.xpath("//img[@title='Ad.Plus Advertising']")).size()!=0){
			driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		}
		Thread.sleep(3000);
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,300)", "");
		
		WebElement multiDd = driver.findElement(By.xpath("//div[text()='Select...']"));
		Actions action  = new Actions(driver);
		action.moveToElement(multiDd).click().build().perform();
		//multiDd.click();
		
		driver.findElement(By.xpath("//div[text()='Green']")).click();
	}

}
