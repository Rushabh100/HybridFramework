package testLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.Loginpage1;

public class LoginTest2 extends BaseClass {

	@Test
	public void loginApp() {

		logger = report.createTest("Login Functionality");
		logger.info("Login Test Started");

		Loginpage1 login = new Loginpage1(driver);

		login.enterEmail("rushabh@gmail.com");

		login.enterPassword("Rushabh@12345");

		login.clickSubmit();

		logger.info("Login Test Completed");
	}

	@Test
	public void m1() {

		System.out.println("M1 method started");
		logger = report.createTest("M1 Method");
		logger.info("M1 method started");

		logger.info("M1 method Completed");

	}

}
