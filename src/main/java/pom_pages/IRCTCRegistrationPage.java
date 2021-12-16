
package pom_pages;

import wrappers.GenericWrapper;

public class IRCTCRegistrationPage extends GenericWrapper {
	
	public IRCTCRegistrationPage enterUserName(String username){
		threadWait(3000);
		enterByName("userName", username);
		return new IRCTCRegistrationPage();
	}

	public IRCTCRegistrationPage enterPassword(String  password){
		//threadWait(3000);
		enterById("usrPwd", password);
		return this;
	}
	public IRCTCRegistrationPage enterConfirmPassword(String confpassword ){
		enterById("cnfUsrPwd", confpassword);
		return this;
	}
	
	public IRCTCRegistrationPage selectPreferedLanguage(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[2]/span");
	clickByXpath(
			"/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li");
	return this;
	
	}
	public IRCTCRegistrationPage selectSecurityQuestion(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[2]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
			return this;	
				
			
	}
	
	public IRCTCRegistrationPage enterselectAnswer(String selectanswer){
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input",selectanswer);
		return this;
	}
	public IRCTCRegistrationPage clickOnCountinue(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		return this;
	}
	
	public IRCTCRegistrationPage enterFirstName(String firstname){
		
		enterByName("firstName",firstname);
		return this;
	}
	public IRCTCRegistrationPage enterMiddleName(String middlename){
		enterById("middleName",middlename);
		return this;
}
	public IRCTCRegistrationPage enterlastname(String lastname){
		enterByName("lastname",lastname);
		return this;
	}
	
	public IRCTCRegistrationPage selectOccupation()
	{
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[2]/span");
		
        threadWait(3000);
        
        clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
		return this;
			}
	

	public IRCTCRegistrationPage selectDateofbirth(String month,String year){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input");
		threadWait(3000);
		
		selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]",month);
		 selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]", year);
		 clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[6]/a");
		return this;
		 
	}
	
	public IRCTCRegistrationPage clickbutton()
	{
		clickById("unmarried");
		return this;
	}
	public IRCTCRegistrationPage selectcountryName(String countryname){
	
		 selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[8]/select",countryname);
		 return this;
	}
	public IRCTCRegistrationPage clickonGender(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[2]/span");
		return this;
	}
	public IRCTCRegistrationPage enterEmail(String email){
		enterByName("email",email);
		return this;
	}
	
	public IRCTCRegistrationPage enterMobileno(String Mobileno){
		enterById("mobile",Mobileno);
		return this;
	}
	public IRCTCRegistrationPage selectNationality( String Nationality){
		selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select",Nationality);
		return this;
	}
	public IRCTCRegistrationPage clickOnContinue(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		return this;
	}
	//
	public IRCTCRegistrationPage enterHouseno(String houseno){
		enterById("resAddress1",houseno);
		return this;
	}
	public IRCTCRegistrationPage enterStreet(String Street){
		 enterByName("resAddress2",Street);
		 return this;
	}
	public IRCTCRegistrationPage enterArea(String Area){
		enterById("resAddress3",Area);
		return this;
		
	}
	public IRCTCRegistrationPage enterPincode(String Pincode){
		 enterByName("resPinCode",Pincode);
		 return this;
	}
	public IRCTCRegistrationPage enterState(String State){
		 enterByName("resState",State);
		 return this;
		 
		
	}
	public IRCTCRegistrationPage selectCity(String city){
		threadWait(3000);
		selectVisibleTextByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select",city);
		return this;
		}
	public IRCTCRegistrationPage selectOffice(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");
			return this;	
	}
	public IRCTCRegistrationPage enterPhone(String Phone){
		enterById("resPhone",Phone);
		return this;
		}
	public IRCTCRegistrationPage clickonyesAddress(){
		clickById("yes");
		return this;
	}

}

	
	
	
	
	





	

