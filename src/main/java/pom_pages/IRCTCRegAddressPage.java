package pom_pages;

import wrappers.GenericWrapper;


public class IRCTCRegAddressPage  extends GenericWrapper{
	public void enterHouseno(String houseno){
		enterById("resAddress1",houseno);
		//return this;
	}
	public void enterStreet(String Street){
		 enterByName("resAddress2",Street);
	}
	public void enterArea(String Area){
		enterById("resAddress3",Area);
		
	}
	public void enterPincode(String Pincode){
		 enterByName("resPinCode",Pincode);
		 
	}
	public void enterState(String State){
		 enterByName("resState",State);
		 
		
	}
	public void selectCity(String city){
		threadWait(3000);
		selectVisibleTextByXpath("Selectcity",city);
		
		}
	public void selectOffice(){
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");
				
	}
	public void enterPhone(String Phone){
		enterById("resPhone",Phone);
		}
	public void clickonyesAddress(){
		clickById("yes");
	}

}
