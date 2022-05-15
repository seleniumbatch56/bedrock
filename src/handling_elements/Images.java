package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement facebookImage = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		System.out.println(facebookImage.isDisplayed());
		
		System.out.println("Width of the image: "+facebookImage.getSize().getWidth());
		
		System.out.println("Height of the image: "+facebookImage.getSize().getHeight());
		
		driver.quit();

	}

}
