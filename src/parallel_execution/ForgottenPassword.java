package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForgottenPassword extends Base{

	@Test
	public void testForgottenPasswordLink() {
		
		WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("Forgot"));

		forgottenPasswordLink.click();

	}

}
