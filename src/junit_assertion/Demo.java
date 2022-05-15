package junit_assertion;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import junit_demo.Base;


public class Demo extends Base{
	
	@Test
	public void assertionDemo() {
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		
		/*
		if(forgottenPassword.isEnabled()) {
			forgottenPassword.click();
		}*/
		
		Assert.assertTrue(forgottenPassword.isEnabled());
		
		forgottenPassword.click();
		
		String expectedTitle = "Forgotten Password | Can't Log In | Facebook";
		
		String actualTitle = driver.getTitle();
		
		/*
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title is matching");
		}else {
			System.out.println("Title is not matching");
		}*/
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	

}
