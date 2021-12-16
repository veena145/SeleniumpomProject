package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectWrappers1 extends GenericWrapper{
	@BeforeMethod
	public void beforeMethod() {
		invokeApp("chrome","https://www.facebook.com");
		//clickByXpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a");//
		clickByXpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a");
		}

	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
}


