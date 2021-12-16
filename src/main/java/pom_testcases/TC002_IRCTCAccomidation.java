package pom_testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom_pages.IRCTCHomePage;
import wrappers.ProjectWrappers;

public class TC002_IRCTCAccomidation extends ProjectWrappers {
	
	
	@BeforeClass
	public void assignValues(){
		testcaseName = "TC002";
		testcaseDescription = "This is to test the IRCTC Lounge";
		Author = "Veena";
		Category = "Regression";
	}	
	
	@Test
	public void testCase(){
		IRCTCHomePage page = new IRCTCHomePage();
		//page.clickOnRegister()
	page.mouseHoeverOnHolidays();
	page.mouseoveronStays();
	page. clickOnLounge()
	.selectStationName("AHMEDABAD")
	.selectLounge("IRCTC EXECUTIVE LOUNGE")
	.selectnoofpassangers("2")
	.clickcheckindate()
	.selectcheckinTime("02:00")
	.selectdurationHours("12:00")
	.clickOnBook()
	
	.clickonGuestLogin()
	.entermail("veena.reddy100@gmail.com")
	.enterno("3456782922")
	.clickLogin()
	
	.enterFirstName("tanish")
	.enterAge("35")
	.selectgender("male")
	.entersecondName("mamata")
	.enterage("37")
	.selectgender("female")
	.selectGST("yes")
	.enterMobileNo("3452345678")
	.selectstate("Karnataka")
	.clickOnSubmit();
	
	
	
	
	
	
}
}


