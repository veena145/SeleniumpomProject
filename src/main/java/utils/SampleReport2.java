package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport2 {
	public static void main(String[] args) {
		//startReport
		ExtentReports report = new ExtentReports("./Reports/SampleReport2.html");
		
		//start Test
		ExtentTest test = report.startTest("TC002", "To test the IRCTC LoungeBooking");
		test.assignAuthor("Veena");
		test.assignCategory("IRCT Home Page Testcase");
		
		//LogStatus
		test.log(LogStatus.PASS, "The browser launched successfuly");
		
		test.log(LogStatus.FAIL, "The element is not visible in DOM");
		
		
		test.log(LogStatus.WARNING, "The Text is not matched");
		
		//end Test
			report.endTest(test);
			
			
			//end report
			report.flush();

		
		
	}

}



