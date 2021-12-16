package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrapper {
	@BeforeSuite
	public void beforeSuite(){
		startReport();
	}
	@BeforeTest
	public void beforeTest(){
		//loadProperties();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest();
		invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
		//("chrome", prop.getProperty("URL"));
		threadWait(4000);
		clickByXpath(
			"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		}

	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterTest
	public void afterTest(){
		endTest();
	}
	
	@AfterSuite
	public void afterSuite(){
		endReport();
	}
}
