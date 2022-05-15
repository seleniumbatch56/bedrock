package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends Base{

	@Test
	public void testLogin() {
		WebElement emailAddressOrPhoneNumber = driver.findElement(By.id("email"));

		emailAddressOrPhoneNumber.clear();

		emailAddressOrPhoneNumber.sendKeys("SeleniumBtach56");

		String enteredUserName = emailAddressOrPhoneNumber.getAttribute("value");

		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.submit();
	}
}
