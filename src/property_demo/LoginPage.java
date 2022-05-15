package property_demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage extends Base{

	
	@Test
	public void testLogin() throws IOException {
		
		//FileInputStream fis = new FileInputStream("D:\\Batch 56\\Selenium\\Workspace\\SeleniumBatch56\\src\\property_demo\\ReadData.properties");
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("D:\\Batch 56\\Selenium\\Workspace\\SeleniumBatch56\\src\\property_demo\\ReadData.properties"));
		
		//String username = prop.getProperty("emailId");
		//String pwd = prop.getProperty("password");
		
		WebElement emailAddressOrPhoneNumber = driver.findElement(By.id("email"));

		emailAddressOrPhoneNumber.clear();

		emailAddressOrPhoneNumber.sendKeys(prop.getProperty("emailId"));

		String enteredUserName = emailAddressOrPhoneNumber.getAttribute("value");

		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys(prop.getProperty("password"));
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.submit();
	}
}
