package pom_pages;

import wrappers.GenericWrapper;

public class PassengerDetailsPage  extends GenericWrapper {
	public PassengerDetailsPage enterFirstName(String Firstname){
		threadWait(3000);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/input",Firstname);
		return this;
	}
	public PassengerDetailsPage enterAge(String enterAge){
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr/td[3]/input",enterAge);
		return this;
	}
	public PassengerDetailsPage selectGender(String Gender){
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select",Gender);
		return this;
	}

	public PassengerDetailsPage entersecondName(String secondName){
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input",secondName);
		return this;
	}
	public PassengerDetailsPage enterage(String enterage){
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input",enterage);
		return this;
		
	}
	public PassengerDetailsPage selectgender(String gender){
	
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select",gender);
		return this;
	}
	
	public PassengerDetailsPage selectGST(String yes){
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div[1]/select",yes);
		return this;
	}
	
	//public void enterEmailId(String Email){
		
	//}//
	public PassengerDetailsPage enterMobileNo(String mobile){
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div[2]/input",mobile);
		return this;
	}
	public PassengerDetailsPage selectstate(String state){
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[3]/form/div[3]/select",state);
		return this;
	}
	public PassengerDetailsPage clickOnSubmit(){
		clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]");
		return this;
	}
}
