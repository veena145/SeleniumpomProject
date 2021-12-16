package testcases;

import org.testng.annotations.Test;

import utils.DataProvider_TC003;
import wrappers.ProjectWrappers1;

public class TC003_Facebook extends ProjectWrappers1 {
	@Test(dataProvider="testcase3",dataProviderClass=DataProvider_TC003.class)
	public void Facebook(String firstname,String lastname,String reg_email,String reg_email_confirmation,String password,String month,String day,String year){
		threadWait(3000);
		 enterByName("firstname", firstname);
		 enterByName("lastname", lastname);
		 enterByName("reg_email__",reg_email );
		 threadWait(300);
		 enterByName("reg_email_confirmation__", reg_email_confirmation);
		 enterById("password_step_input", password);
		 selectVisibileTextById("month", month);
		 selectByValueById("day",day );
		 selectByValueById("year", year);
		 clickByXpath("//input[@name='sex'][1]");
		 
	}

	
	}



