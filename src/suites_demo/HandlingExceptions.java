package suites_demo;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

public class HandlingExceptions {
	
	@Test(groups = "P1")
	public void c1() {
		System.out.println("c1 Test");
	}
	
	@Test(groups = "P2")
	public void b1() {
		System.out.println("b1 Test");
	}
	
	@Test(groups = "P3")
	public void a1() {
		System.out.println("a1 Test");
		//System.out.println(2/0);
		/*
		try {
		System.out.println(2/0);
		}catch(A e) {
			
		}*/
	
	}
	
	@Test(groups = "P4")
	public void d1() {
		System.out.println("d1 Test");
	}

}
