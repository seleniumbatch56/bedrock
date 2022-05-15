package junit_demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitAnnotations {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		System.out.println("Before Class Annotation");
	}

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void loginTest() throws InterruptedException {		

		WebElement emailAddressOrPhoneNumber = driver.findElement(By.id("email"));

		emailAddressOrPhoneNumber.clear();

		emailAddressOrPhoneNumber.sendKeys("SeleniumBtach56");

		String enteredUserName = emailAddressOrPhoneNumber.getAttribute("value");

		System.out.println(enteredUserName);

		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys("123456");

		Thread.sleep(5000);

	}

	@Test
	public void createNewAccount() throws InterruptedException {

		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();

		WebElement femaleRadioButton = driver.findElement(By.xpath("//span[1]/input"));

		System.out.println("female Radio Button is clicked: " + femaleRadioButton.isSelected());

		femaleRadioButton.click();

		System.out.println("female Radio Button is clicked: " + femaleRadioButton.isSelected());

		WebElement maleRadioButton = driver.findElement(By.xpath("//span[2]/input"));

		System.out.println("Male Radio Button is clicked: " + maleRadioButton.isSelected());

		maleRadioButton.click();

		System.out.println("Male Radio Button is clicked: " + maleRadioButton.isSelected());

	}

	@Test
	public void forgottentPassword() throws InterruptedException {

		WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("Forgot"));

		forgottenPasswordLink.click();

	}

	@After
	public void tearDown() {

		driver.quit();
	}

	@AfterClass
	public static void afterClass() {

		System.out.println("After Class Annotation");
	}

}
