package pom_testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_pages.IRCTCHomePage;
import pom_pages.IRCTCRegistrationPage;
import wrappers.ProjectWrappers;

public class TC001_IRCTCRegistration extends ProjectWrappers {
	
	@BeforeClass
	public void assignValues(){
		testcaseName = "TC001";
		testcaseDescription = "This is to test the IRCTC Registration";
		Author = "Veena";
		Category = "Regression";
	}
	
	@Test
	public void testCase(){
		IRCTCHomePage page = new IRCTCHomePage();
		page.clickOnRegister()
		.enterUserName("Veena")
		.enterPassword("Test@1234")
		.enterConfirmPassword("Test@1234")
		.selectPreferedLanguage()
		.selectSecurityQuestion()
		.enterselectAnswer("dog")
		.clickOnContinue()
		.enterFirstName("Lasya")
		.enterMiddleName("gudumal")
		.enterlastname("reddy")
		.selectOccupation()
		.selectDateofbirth("February", "1992")
		
		.clickbutton()
		.selectcountryName("India")
		.clickonGender()
		.enterEmail("veena.reddy100@gmail.com")
		.enterMobileno("3456782341")
		.selectNationality("India")
		.clickOnCountinue()
		.enterHouseno("house3")
		.enterStreet("line no2")
		.enterArea("chandanagagar")
		.enterPincode("500050")
		.enterState("Hyderabad")
		.selectCity("HYDERABAD")
		.selectOffice()
		.enterPhone("345879234")
		.clickonyesAddress();
		
		
		
		
		
		
		
		
	}

	
		
	}


