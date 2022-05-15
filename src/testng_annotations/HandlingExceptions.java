package testng_annotations;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

public class HandlingExceptions {
	
	@Test()
	public void c1() {
		System.out.println("c1 Test");
	}
	
	@Test()
	public void b1() {
		System.out.println("b1 Test");
	}
	
	@Test(expectedExceptions = {ArithmeticException.class, NoSuchElementException.class, NullPointerException.class, StaleElementReferenceException.class})
	public void a1() {
		System.out.println("a1 Test");
		System.out.println(2/0);
		/*
		try {
		System.out.println(2/0);
		}catch(A e) {
			
		}*/
	
	}
	
	@Test
	public void d1() {
		System.out.println("d1 Test");
	}

}
