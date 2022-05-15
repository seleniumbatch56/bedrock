package testng_annotations;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = -1)
	public void c1() {
		System.out.println("c1 Test");
	}
	
	@Test
	public void b1() {
		System.out.println("b1 Test");
	}
	
	@Test
	public void a1() {
		System.out.println("a1 Test");
	}
	
	@Test(priority = -4)
	public void d1() {
		System.out.println("d1 Test");
	}

}
