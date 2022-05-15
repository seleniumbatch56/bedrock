package junit_assertion;

import org.junit.Assert;
import org.junit.Test;

public class AssertionDemo {

	@Test
	public void demo() {
		
		System.out.println("Hi");
		
		Assert.assertTrue(2/2==0);
		//Assert.assertFalse(2/2==1);
		
		//Assert.assertEquals("Java", "Java");
	
		System.out.println("Bye");
		
	}
}
