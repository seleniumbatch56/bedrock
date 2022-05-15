package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		WebElement carsDropdown = driver.findElement(By.cssSelector("#cars"));
		
		Select cars = new Select(carsDropdown);

		System.out.println("Is Cars Dropdown a Multidropdown? : "+ cars.isMultiple());
		
		cars.selectByIndex(0);
		cars.selectByValue("saab");
		cars.selectByVisibleText("Audi");
		
		System.out.println("First Selected Option is: "+ cars.getFirstSelectedOption().getText());
		System.out.println("---------------------------------------------------");
		
		List<WebElement> allOptions = cars.getOptions();
		
		System.out.println("All Options are: ");
		System.out.println("-------------------");
		for(int i=0; i<allOptions.size();i++) {
			
			System.out.println(allOptions.get(i).getText());
		}
		
		List<WebElement> allSelectedOptions = cars.getAllSelectedOptions();
		System.out.println("All Selected Options are:");
		System.out.println("****************************");
		for(WebElement selectedOptions:allSelectedOptions ) {
			System.out.println(selectedOptions.getText());
		}
		
		cars.deselectByIndex(1);
		
		System.out.println("Updated Selected options are: ");
		System.out.println("_______________________________");
		
		allSelectedOptions = cars.getAllSelectedOptions();
		for(WebElement selectedOptions:allSelectedOptions ) {
			System.out.println(selectedOptions.getText());
		}
		
	}

}
