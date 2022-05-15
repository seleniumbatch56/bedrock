package testng_annotations;

import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test
	public void testLoginWithValidCredentials() {
		
		String userName = "SeleniumBatch56";
		
		String password = "123456";
		
		System.out.println(userName);
		
		System.out.println(password);
		
	}
	
	@Test
	public void testLoginWithInValidUser() {
		
		String userName = "SeleniumBatch55";
		
		String password = "123456";
		
		System.out.println(userName);
		
		System.out.println(password);
		
	}
	
	@Test
	public void testLoginWithInValidPassword() {
		
		String userName = "SeleniumBatch55";
		
		String password = "456123";
		
		System.out.println(userName);
		
		System.out.println(password);
		
	}

}
