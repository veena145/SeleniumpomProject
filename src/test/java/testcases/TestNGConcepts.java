package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcepts {
	@BeforeSuite(groups={"smoke","regression","functional"})
	public void beforeSuite(){
		System.out.println("I am before suite");
	}
	@BeforeTest(groups={"smoke","regression","functional"})
	public void beforeTest(){
		System.out.println("I am before test");
	}

	@BeforeClass(groups={"smoke","regression","functional"})
	public void beforeClass(){
		System.out.println("I am before class");
	}
	
	@BeforeMethod(groups={"smoke","regression","functional"})
	public void beforeMethod(){
		System.out.println("I am before Method");
	}
	@Test(priority = 0, groups = "smaoke")
	public void test(){
		System.out.println("i am testcase 1");
	}
	
	@Test(priority = -2, groups={"smoke","regression"})
	public void test1(){
		System.out.println("i am testcase 2");
	}
	
	@Test(enabled = true,groups ="functional")
	public void test2(){
		System.out.println("i am testcase 3");
	}
	
	@Test(priority = -1,groups = "smoke")
	public void test3(){
		System.out.println("i am testcase 4");
	}
	
	
	@AfterSuite(groups={"smoke","regression","functional"})
	public void ASuite(){
		System.out.println("I am After suite");
	}
	@AfterTest(groups={"smoke","regression","functional"})
	public void afterTest(){
		System.out.println("I am after test");
	}

	@AfterClass(groups={"smoke","regression","functional"})
	public void afterClass(){
		System.out.println("I am after class");
	}
	
	@AfterMethod(groups={"smoke","regression","functional"})
	public void afterMethod(){
		System.out.println("I am after Method");
	}
	
	
}
