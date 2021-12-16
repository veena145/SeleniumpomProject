package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//public abstract class Reports {
public class Reports{
	ExtentReports report;
	static ExtentTest test ;
	public String testcaseName,testcaseDescription,Author,Category;
	public void startReport(){
	//	 report = new ExtentReports("./Reports/SampleReport.html");
		  Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("yyyy_MM_dd_hh_mm_ss_");

	      System.out.println("Current Date: " + ft.format(dNow));
		report = new ExtentReports("./Reports/"+ft.format(dNow)+"AutomationReport.html");
	}
	
	public void startTest(){
		 test = report.startTest(testcaseName, testcaseDescription);
		test.assignAuthor(Author);
		test.assignCategory(Category);
	}
	
//	public abstract long takeSnap();
	
	public void logStatusReport(String status,String Description){
		//long name = takeSnap();
		if(status.equalsIgnoreCase("Pass")){
		test.log(LogStatus.PASS, Description);
			//+test.addScreenCapture("../screenshots/"+name+".jpeg"));
		}else if(status.equalsIgnoreCase("Fail")){
		test.log(LogStatus.FAIL, Description);
			//+test.addScreenCapture("../screenshots/"+name+".jpeg"));
		}else if (status.equalsIgnoreCase("Warning")){
		test.log(LogStatus.WARNING,Description);
			//+test.addScreenCapture("../screenshots/"+name+".jpeg"));
		}
	}
	
	public void endTest(){
		report.endTest(test);
	}
	
	public void endReport(){
		report.flush();
	}

}
