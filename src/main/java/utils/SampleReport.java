package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	public static void main(String[] args) {
		//startReport
		ExtentReports report = new ExtentReports("./Reports/SampleReport.html");
		
		//start Test
		ExtentTest test = report.startTest("TC001", "To test the IRCTC Registration");
		test.assignAuthor("Veena");
		test.assignCategory("IRCT Home Page Testcase");
		
		//LogStatus
		test.log(LogStatus.PASS, "The browser launched successfuly");
		
		test.log(LogStatus.FAIL, "The element is not visible in DOM");
	//test.log(LogStatus.PASS,  "The data entered successfully");
		//test.log(LogStatus.FAIL,  "The Webelement not found to enter the data");
		
		
		test.log(LogStatus.WARNING, "The Text is not matched");
		
		//end Test
			report.endTest(test);
			
			
			//end report
			report.flush();

		
		
	}

}
