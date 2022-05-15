package testng_annotations;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void a1() {
		System.out.println("a1 Test");
	}
	
	@Test
	public void b1() {
		System.out.println("b1 Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	

}
