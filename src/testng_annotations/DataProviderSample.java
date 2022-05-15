package testng_annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {
	
	@Test(dataProvider = "testData")
	public void testLoginWithValidCredentials(String user, String pwd) {
		
		String userName = user;
		
		String password = pwd;
		
		System.out.println(userName);
		
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] testData(){
		
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

}
