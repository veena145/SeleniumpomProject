
package pom_pages;

import wrappers.GenericWrapper;

public class IRCTCGuestUserloginPage extends GenericWrapper {
	public IRCTCGuestUserloginPage clickonGuestLogin(){
		threadWait(3000);
		clickByXpath("/html/body/app-root/login/div/div/div/div/ul/li[2]/a");
		return this;
	}
	
	public IRCTCGuestUserloginPage entermail(String mail){
		threadWait(3000);
	
		enterByName("email",mail);
		return this;
	}
public IRCTCGuestUserloginPage enterno(String no){
enterByName("mobileNo",no);
return this;
}
public PassengerDetailsPage clickLogin(){
	clickByXpath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button");
	return new PassengerDetailsPage();
}
}
