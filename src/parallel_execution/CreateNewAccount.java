package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAccount extends Base{

	@Test
	public void testCreateNewAccount() {
		
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		createNewAccountButton.click();
		
		WebElement signUpLabel = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		
		Assert.assertTrue(signUpLabel.isDisplayed());
	}
}
