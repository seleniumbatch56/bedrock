package handling_mouseevents;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void testDemo() throws InterruptedException {

		Actions action  = new Actions(driver);

		//action.click().perform();

		//action.click(driver.findElement(By.linkText("Forgotten password?"))).perform();

		//action.contextClick().perform();

		//action.contextClick(driver.findElement(By.linkText("Forgotten password?"))).perform();

		//action.doubleClick().perform();



		/*
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

		Thread.sleep(5000);

		WebElement checkbox1 = driver.findElement(By.xpath("//h3[text()='Checkboxes']/following::form/input[1]"));

		action.doubleClick(checkbox1).perform();
		 */

		/*
		driver.navigate().to("https://mousetester.com/");

		Thread.sleep(5000);

		WebElement clicMeButton = driver.findElement(By.xpath("//p[text()='CLICK ME!']"));

		action.doubleClick(clicMeButton).perform();	
		 */

		//action.moveByOffset(200, 400).contextClick().build().perform();


		Thread.sleep(5000);

	}

	@Ignore
	@Test
	public void mouseHoverDemo() throws InterruptedException {

		driver.navigate().to("https://www.aptransport.org/");

		WebElement license = driver.findElement(By.xpath("//a[text()='Licence' and @class='toplink']"));

		Actions action = new Actions(driver);

		action.moveToElement(license).perform();
		action.moveToElement(driver.findElement(By.linkText("Learner's Licence"))).click().build().perform();

		Thread.sleep(5000);

	}

	@Ignore
	@Test
	public void dragAndDropDemo() throws InterruptedException {

		driver.navigate().to("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement targetElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions action = new Actions(driver);

		action.dragAndDrop(sourceElement, targetElement).perform();

		Thread.sleep(5000);

	}

	@Ignore
	@Test
	public void dragAndDropByDemo() throws InterruptedException {

		driver.navigate().to("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(sourceElement, 100, 150).perform();

		Thread.sleep(5000);

	}

	@Ignore
	@Test
	public void clickAndHoldDemo() throws InterruptedException {

		driver.navigate().to("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement targetElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions action = new Actions(driver);

		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

		Thread.sleep(5000);

	}

	@Test
	public void scrollOperation() throws InterruptedException {

		driver.navigate().to("https://jqueryui.com/droppable/");

		JavascriptExecutor jsx = (JavascriptExecutor)driver;

		jsx.executeScript("window.scrollBy(0, 200)", "");

		Thread.sleep(5000);

		jsx.executeScript("window.scrollBy(0, 300)", "");

		Thread.sleep(5000);

		jsx.executeScript("window.scrollBy(0, 300)", "");

		Thread.sleep(5000);

		jsx.executeScript("window.scrollBy(0, -200)", "");
		
		Thread.sleep(5000);

		jsx.executeScript("window.scrollBy(0, -100)", "");
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
