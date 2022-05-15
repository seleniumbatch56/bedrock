package junit_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class Annotation");
	}
	
	@Before
	public void before() {
		
		System.out.println("Before Annotation");
	}
	
	@Test
	public void a1() {
		System.out.println("a1 test case");
	}
	
	@Test
	public void c1() {
		System.out.println("c1 test case");
	}
	
	@Test
	public void b1() {
		System.out.println("b1 test case");
	}
	
	@After
	public void after() {
		
		System.out.println("After Annotation");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("After Class Annotation");
	}

}
