package testcases;



import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC002_IrctcLoungeBooking extends ProjectWrappers {
@Test
	public void irctcLoungeBooking() {
		
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		threadWait(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		mouseover("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		threadWait(3000);
		mouseover("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");


		switchToLastWindow();
	
		
		
		selectVisibleTextByName("city", "AHMEDABAD");
		threadWait(3000);
		selectVisibleTextByName("laungecity","IRCTC EXECUTIVE LOUNGE");
		threadWait(3000);
		selectByValueByName("selPassangers","2");
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/input");
		clickByXpath ("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]");
		
		enterByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[2]");
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[1]/td[6]/span");
		
		
		selectVisibleTextByName("checkInTime","02:00");
		
		selectVisibleTextByName("checkOutTime","12:00");
		threadWait(3000);
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]");
		threadWait(3000);
		clickByXpath("/html/body/app-root/login/div/div/div/div/ul/li[2]/a");
		threadWait(3000);
		enterByName("email","veena.reddy100@gmail.com");
		enterByName("mobileNo", "3588436510");
		
		clickByXpath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button");
		
		threadWait(3000);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input", "papa");
		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input","30" );
		
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select","Female" );
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input", "jhanvi");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input","29");
		threadWait(3000);
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select","Female" );
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div[1]/select", "Yes");

		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div[2]/input","234512345689654" );
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[3]/form/div[3]/select", "KARNATAKA");
clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]");
 threadWait(3000);
 getTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[2]/div/div[1]/span");
 getTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[2]/div/div[2]/span");
 
		
}
}

		