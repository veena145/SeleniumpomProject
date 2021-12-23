package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.DataProvider_TC001;
import wrappers.GenericWrapper;
import wrappers.ProjectWrappers;

public class TC001_IrctcRegistration extends ProjectWrappers {
	@BeforeClass
	public void assignValues(){
		testcaseName = "TC001";
		testcaseDescription = "IRCTC";
		Author = "Veena";
		Category = "Smoke";
	}
@Test(dataProvider="testcase1",dataProviderClass=DataProvider_TC001.class)
	public void irctcRegistration(String username,String password,String confpassword,String pet) {
				
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		threadWait(3000);
		enterByName("userName", username);

		enterById("usrPwd", password);
		enterById("cnfUsrPwd", confpassword);
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[2]/span");
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li");
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[2]/span");

		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
		enterByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input",
				pet);
	//	clickByXpath(
				///"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input");


		// personal detaills//
		enterByName("firstName", "lasya");
		enterById("middleName", "gudumal");
		enterByName("lastname", "reddy");
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[2]/span");

		threadWait(3000);
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
		threadWait(3000);
		clickByXpath(
				"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input");
		 selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]","February" );

		 selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]", "1992");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[6]/a");
		clickById("unmarried");
		threadWait(3000);
		
		 selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[8]/select", "India");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[2]/span");
		
		enterByName("email","veenareddy@123");
		enterById("mobile","9234532729" );
		threadWait(3000);
		selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select","India" );
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	

	
	
		enterById("resAddress1", "Bloock no3");
         enterByName("resAddress2", "line no2");
          enterById("resAddress3", "chandranagar");
          enterByName("resPinCode", "500050");
          enterByName("resState","hyderabad" );
          threadWait(3000);
          selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select", "HYDERABAD");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");
		enterById("resPhone", "34567812");
		clickById("yes");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[11]/div/app-captcha/div");
				
	
	}
}
