package pom_pages;

import wrappers.GenericWrapper;

public class IRCTCHomePage extends GenericWrapper {

	public void clickOkOnAlert() {
		clickByXpath(
				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
	}

	public IRCTCRegistrationPage clickOnRegister() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		return new IRCTCRegistrationPage();
	}
	

	public IRCTCHomePage mouseHoeverOnHolidays() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		return this;
	}

	public IRCTCHomePage mouseoveronStays() {
		clickByXpath(
				"/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		return this;
	}

	public IRCTCAccomidationPage clickOnLounge() {
		clickByXpath(
				"/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		switchToLastWindow();

		return new IRCTCAccomidationPage();
	}

	
}
