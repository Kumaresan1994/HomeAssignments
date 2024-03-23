package base;
import com.aventstack.extentreports.MediaEntityBuilder;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
public class BaseClass extends AbstractTestNGCucumberTests{
	public String filedata;
	public String path ="./SnapShot/Report.html";
	public ExtentReports exe;
	public static ExtentTest test;
	//	public static ChromeDriver driver;
	private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();

	public void setDriver() {
		tldriver.set(new ChromeDriver());

	}
	public RemoteWebDriver getDriver() {
		return tldriver.get();

	}
	@BeforeMethod
	public void login() {

		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void closeBrowser() {

		getDriver().close();
	}
	@DataProvider(name="getdata", indices= {2})
	public String [][] sentData() throws IOException{			
		return utils.ReadExcel.exevalue(filedata);
	}
	@BeforeSuite
	public void startReport() {
		
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		 exe = new ExtentReports();
		 exe.attachReporter(report);
	}
	@BeforeClass
	public void setDetails() {
		 test =exe.createTest("Login page"," Login with valid data");
		 test.assignAuthor("Kumar");
			test.assignCategory("Regression");
	}
	@AfterSuite
	public void  endReport() {
		exe.flush();
		System.out.println("Completed");
		
	}
	
	
	public void reportStep(String status, String description) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			test.pass(description, MediaEntityBuilder.createScreenCaptureFromPath(".././Snapshot/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(description, MediaEntityBuilder.createScreenCaptureFromPath(".././Snapshot/img/"+takeSnap()+".png").build());
		}
		
	}
	public int takeSnap() throws IOException {
		
		 Random rand = new Random();	
	    int randomNumber = rand.nextInt(1000);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File des = new File("./Snapshot/img"+randomNumber+".png");
		FileUtils.copyFile(src, des);
		return randomNumber;
	}
	
}
