package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import utils.Reports;

public class GenericWrapper extends Reports implements Wrappers {
//public class GenericWrapper implements Wrappers {


	static RemoteWebDriver driver;
	//static Properties prop;
	public void invokeApp(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("Internetexplorer")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/internetexplorerdriver.exe");
				driver = new InternetExplorerDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			logStatusReport("PASS", "The browser lauched successfully");
		} catch (NoSuchSessionException e) {
			//System.err.println("there is no session created, please check browser and chromedriver versions");
			logStatusReport("Fail", "there is no session created, please check browser and chromedriver versions");
		} catch (TimeoutException e) {
			//System.err.println("Application is taking tooo long time to load");
			logStatusReport("Fail", "Application is taking tooo long time to load");
		} catch (WebDriverException e) {
			//System.err.println("The browser not launched ");
			logStatusReport("Fail", "The browser not launched ");
		}

	}

	//public void loadProperties(){
		//try {
		//prop = new Properties();
		
			//prop.load(new FileInputStream("./EnvData/Env.properties"));
		//} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	//}
	
		
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try{
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println( "The data entered successfully"); 
			logStatusReport("PASS", "The data entered successfully");
		}catch (NoSuchElementException e) {
			//System.out.println( "The element not available to enter the data");
			logStatusReport("Fail", "The element not available to enter the data");
		}

	}
	public  void enterByName(String nameValue, String data) {
		
		// TODO Auto-generated method stub
		try{
			driver.findElementByName(nameValue).sendKeys(data);
		
		logStatusReport("PASS", "The data entered successfully");
		//System.out.println("enter the data");
		}catch(NoSuchElementException e){
			//System.out.println("The data is not entered");
			logStatusReport("Fail", "The webelement not found to enter the data");
		}
		

	}

	public void enterByXpath(String xpathValue, String data) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println(" The data entered");
			logStatusReport("PASS" ,"The data entered");
		} catch(NoSuchElementException e) {
			logStatusReport("fail" ,"The data can't entered");
			//System.out.println("The Data can't entered");
		}
		}
	public void enterByXpath(String xpathValue){
	try {
		driver.findElementByXPath(xpathValue);
		logStatusReport("Pass","enter the value");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		logStatusReport("Fail","can't enter the value");
	}
	}

	public void verifyTitle(String title) {
		try{
		// TODO Auto-generated method stub
		String Title2 = driver.getTitle();
		
		if (Title2.equalsIgnoreCase(title)) {
			System.out.println("the tille is same");
		} else {
			System.out.println("the title is different");
			
		}logStatusReport("PASS","The title is same");
		}
		
		catch(NoSuchWindowException e){
			logStatusReport("fail","the title is different");
		}
	}

	public void  mouseover(String value ){
		try{
		
		Actions act = new Actions(driver);
		WebElement target = driver.findElementByXPath(value);
		act.moveToElement(target).perform();
		
	}catch(NoSuchElementException e){
		
	}
	}
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).getText();
			logStatusReport("PASS", "Print the text in console");
			//System.out.println("print the text in console");
		} catch (NoSuchWindowException e) {
			logStatusReport("Fail", "cant't print the text in console");
			//System.out.println("cant't print the text in console");
			//System.err.println(e.getMessage());
		}

	}

	public void verifyTextByXpath(String xpath, String text) {
		try{
		// TODO Auto-generated method stub
		String text1 = driver.findElementByXPath(text).getText();
		if (text1.equalsIgnoreCase(text)) {
			logStatusReport("PASS","The text should match" );
			System.out.println("The text should match");
		} else {
			System.out.println("The text should not match");
		}
		logStatusReport("PASS","The text should match" );
		}catch(NoSuchWindowException e){
			
		logStatusReport("fail", "The text should not match");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try{
			
		
		String text1 = driver.findElementByXPath(xpath).getText();
		if (text1.contains(text)) {
			System.out.println("expected text is available in actual text");

		} else {
			System.out.println("expected text is not available in actual text");
		}}catch(NoSuchWindowException e){
			
		}

	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("The element clicked successfully");
			//logStatusReport("PASS","The element clicked successfully");
			
		} catch (NoSuchElementException e) {
			System.out.println("The element is not found");
			//logStatusReport("fail", "The element is not found");	
		}

	}

	public void clickByClassName(String classVal) {
		try{
		
		driver.findElementByClassName(classVal).click();
		System.out.println("The element clicked by named successfully");
	//logStatusReport("PASS", "The element clicked by named successfully");
	
} catch (NoSuchElementException e) {
	System.out.println("The element is not found");
	//logStatusReport("Fail", "The element is not found");	
}
	}
	

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try{
		driver.findElementByName(name).click();
		//logStatusReport("PASS", "The element clicked successfully");
		System.out.println("The element clicked successfully");
	}catch (NoSuchElementException e) {
		System.out.println("The element is not found");
		//logStatusReport("fail", "The element is not found");
	}
	}
	
public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try{
		 driver.findElementByLinkText(name).click();
		// logStatusReport("pass", "The element clicked on link successfully");
		 System.out.println("The element clicked successfully");
	}catch (NoSuchElementException e) {
		System.out.println("The element is not found");
		//logStatusReport("fail", "The element is not found");
	}
}


public void clickByLinkNoSnap(String name) {
	try{
	driver.findElementByLinkText(name).click();
	logStatusReport("PASS", "The element clicked on link successfully");
	 //System.out.println("The element clicked successfully");
	}catch(NoSuchElementException e) {
		//System.out.println("The element is not found");
		logStatusReport("fail", "The element is not found");
	}
}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try
		 {
			driver.findElementByXPath(xpathVal).click();
			//logStatusReport("PASS", "The element clicked successfully");
			System.out.println("The element clicked successfully");
		} 	catch (NoSuchElementException e) {
		System.out.println("The element is not available in DOM");
			//logStatusReport("fail", "The element not found in DOM");
		}

	}

	public void clickByXpathNoSnap(String xpathVal) {
try{
		driver.findElementByXPath(xpathVal).click();
		//System.out.println("The element clicked on value successfully");
	}catch(NoSuchElementException e){
		//System.out.println("The element is not available in DOM");
	}}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		try{
		String value = driver.findElementById(idVal).getText();
		
		return value;
		}catch(NoSuchWindowException e){
			
		}
		return idVal;
		}

	

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = driver.findElementByXPath(xpathVal).getText();

		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stu//
		try{
		WebElement id1 = driver.findElementById(id);
		Select text = new Select(id1);
		text.selectByVisibleText(value);
		System.out.println("The element selected value successfully");
		}catch(NoSuchElementException e){
			System.out.println("The element not found in DOM");
		}
	}
	public void selectVisibleTextByName(String name, String value){
		try{
		WebElement name1 = driver.findElementByName(name);
		Select text1 = new Select(name1);
		text1.selectByVisibleText(value);
		System.out.println("The element selected value successfully");
	}catch(NoSuchElementException e){
		System.out.println("The element not found in DOM");
	}
	}
	public void selectVisibleTextByXpath(String xpath,String value){
		try{
			WebElement value2 = driver.findElementByXPath(xpath);
		Select text3 = new Select(value2);
		text3.selectByVisibleText(value);
		System.out.println("The element selected text successfully");
		}catch(NoSuchElementException e){
			System.out.println("The element not found in DOM");
		}
	}
	public void selectByValueByName(String name,String value){
		try{
			WebElement name2 = driver.findElementByName(name);
		Select text2 = new Select(name2);
		text2.selectByValue(value);
		System.out.println("The element selected value successfully");
	}catch(NoSuchElementException e){
		System.out.println("The element not found in DOM");
	}
		
	}
	public void selectByValueById(String id,String value){
		try{
		WebElement name3 = driver.findElementById(id);
		Select text3 = new Select(name3);
		text3.selectByValue(value);
		System.out.println("The element selected value successfully");
	}catch(NoSuchElementException e){
		System.out.println("The element not found in DOM");
	}}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try{
		WebElement dropdown = driver.findElementById(id);
		Select field = new Select(dropdown);
		field.selectByIndex(value);
		System.out.println("The element selected value By index successfully");
	}catch(NoSuchElementException e){
		System.out.println("The element not found in DOM");
	}
	}
	

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		Set<String> allwindows = driver.getWindowHandles();
		for (String a : allwindows) {
			driver.switchTo().window(a);
			break;
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String a : allwindows) {
			driver.switchTo().window(a);
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		return alerttext;
	}

	//public long takeSnap() {

		//File screen = driver.getScreenshotAs(OutputType.FILE);
		//long name = Math.round((Math.random()*100000000l));
		//0.012451245*100000000l = 0012451245
		//File dest = new File("./screenshots/"+name+".jpeg");
		//try {
			//FileUtils.copyFile(screen, dest);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//return name;
	//}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	public void threadWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	
//	@Override
	//public long takeSnap() {
		// TODO Auto-generated method stub
		//return 0;
//	}

}
//}
