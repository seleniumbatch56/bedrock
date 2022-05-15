package testng_annotations;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(dependsOnMethods = {"a1","d1"})
	public void c1() {
		System.out.println("c1 Test");
	}
	
	@Test(dependsOnMethods = "a1")
	public void b1() {
		System.out.println("b1 Test");
	}
	
	@Test
	public void a1() {
		System.out.println(2/0);
	}
	
	@Test
	public void d1() {
		System.out.println("d1 Test");
	}
	
}
