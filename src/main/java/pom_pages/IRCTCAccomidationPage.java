package pom_pages;

import wrappers.GenericWrapper;

public class IRCTCAccomidationPage extends GenericWrapper{
	
	public IRCTCAccomidationPage selectStationName(String stationname){
		threadWait(3000);
		selectVisibleTextByName("city", stationname);
		return this;

	}
	public IRCTCAccomidationPage selectLounge(String loungename){
		threadWait(3000);
		selectVisibleTextByName("laungecity",loungename);
		
		return this;
}
	public IRCTCAccomidationPage selectnoofpassangers(String passanger ){
		threadWait(3000);
		selectByValueByName("selPassangers",passanger);
		return this;
	}
	
	public IRCTCAccomidationPage clickcheckindate(){
		//clickByXpath("date");
clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/input");
		
        clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]");
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[2]");


		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[1]/td[6]/span");
		return this;
		
	}
	public IRCTCAccomidationPage selectcheckinTime(String Time ){
		selectVisibleTextByName("checkInTime",Time);
		return this;
		
		}
	public IRCTCAccomidationPage selectdurationHours(String Hours){
		selectVisibleTextByName("checkOutTime",Hours);
		return this;
		
	}

		public IRCTCGuestUserloginPage clickOnBook(){
		threadWait(3000);
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]");
		return new IRCTCGuestUserloginPage();
		
	}
	
	}


