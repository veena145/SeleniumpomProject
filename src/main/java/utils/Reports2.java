package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports2 {
	ExtentReports report;
	ExtentTest test ;
	public String testcaseName,testcaseDescription,Author,Category;
	public void startReport(){
		
	report = new ExtentReports("./Reports/SampleReport2.html",false);
	}
	
	public void startTest(){
		 test = report.startTest(testcaseName, testcaseDescription);
		test.assignAuthor(Author);
		test.assignCategory(Category);
	}
	
	public void logStatusReport(String status,String Description){
		if(status.equalsIgnoreCase("Pass")){
		test.log(LogStatus.PASS, Description);
		}else if(status.equalsIgnoreCase("Fail")){
		test.log(LogStatus.FAIL, Description);
		}else if (status.equalsIgnoreCase("Warning")){
			test.log(LogStatus.WARNING,Description);
		}
	}
	
	public void endTest(){
		report.endTest(test);
	}
	
	public void endReport(){
		report.flush();
	}

}



