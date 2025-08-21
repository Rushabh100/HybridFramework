package baseLayer;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilsLayer.BrowserClass;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports report;
	public ExtentSparkReporter sparkReporter;
	public ExtentTest logger;

	@BeforeSuite
	public void setupSuit() {
		report = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(".\\target\\reports.html");
		report.attachReporter(sparkReporter);
	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Test Case Failed");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Test Case Pass");
		} else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("Test Case Skipped");
		}

		report.flush();
	}

	@BeforeClass
	public void setup() {

		driver = BrowserClass.startApplication(driver, "Chrome",
				"https://thinking-tester-contact-list.herokuapp.com/login");
		System.out.println("Application started");
		System.out.println("BEFORE-CLASS Method");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		System.out.println("After-Class method");
		System.out.println("Closing the Browser");
		BrowserClass.quitBrowser(driver);
	}

}
