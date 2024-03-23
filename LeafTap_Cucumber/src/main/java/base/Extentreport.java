package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {

	public static void main(String[] args) {
		String path ="./SnapShot/Report.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		
		//report.set
	  //  report.setAppendExisting(true);
		ExtentReports exe = new ExtentReports();
		
		exe.attachReporter(report);
		ExtentTest test =exe.createTest("Login page"," Login with valid data");
		test.assignAuthor("Kumar");
		test.assignCategory("Regression");
		
		test.pass("Enter Username", MediaEntityBuilder.createScreenCaptureFromPath(".././SnapShot/img1.png").build());
		test.pass("Enter Password");
		test.fail("click login button");
		
		
		exe.flush();
		System.out.println("Completed");
	}

}
