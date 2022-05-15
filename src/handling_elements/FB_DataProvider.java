package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FB_DataProvider {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		
	}
	
	@Test(dataProvider = "testData1")
	public void fbLoginTest(String user, String pwd) throws InterruptedException {
		
		WebElement emailAddressOrPhoneNumber = driver.findElement(By.id("email"));

		emailAddressOrPhoneNumber.clear();

		emailAddressOrPhoneNumber.sendKeys(user);

		String enteredUserName = emailAddressOrPhoneNumber.getAttribute("value");

		System.out.println(enteredUserName);

		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys(pwd);

		Thread.sleep(5000);
	}
	
	@DataProvider
	public Object[][] testData1(){
		
		/*
		Object data[][] = new Object[4][2];
		data[0][0] = "SeleniumBatch56";
		data[0][1] = "123456";
		
		data[1][0] = "SeleniumBatch55";
		data[1][1] = "123456";
		
		data[2][0] = "SeleniumBatch56";
		data[2][1] = "987145";
		
		data[3][0] = "SeleniumBatch57";
		data[3][1] = "5641234";
		
		return data;
		*/
		Object data[][] = {{"SeleniumBatch56","123456"},{"SeleniumBatch55","123456"},
						   {"SeleniumBatch56","987145"},{"SeleniumBatch57","5641234"}};
		
		return data;
	}
	
	@DataProvider
	public Object[][] testData2(){
		
		/*
		Object data[][] = new Object[4][2];
		data[0][0] = "SeleniumBatch56";
		data[0][1] = "123456";
		
		data[1][0] = "SeleniumBatch55";
		data[1][1] = "123456";
		
		data[2][0] = "SeleniumBatch56";
		data[2][1] = "987145";
		
		data[3][0] = "SeleniumBatch57";
		data[3][1] = "5641234";
		
		return data;
		*/
		Object data[][] = {{"SeleniumBatch56","123456"},{"SeleniumBatch55","123456"},
						   {"SeleniumBatch56","987145"},{"SeleniumBatch57","5641234"}};
		
		return data;
	}

	@AfterMethod
	public void tearDown() {

		driver.close();

	}

}
