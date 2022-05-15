package testng_annotations;

import org.testng.annotations.Test;

public class Grouping {
	
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
	}
	
	@Test(groups = "P1")
	public void d1() {
		System.out.println("d1 Test");
	}

}
