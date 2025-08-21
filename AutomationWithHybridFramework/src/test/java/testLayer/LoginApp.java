package testLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.Loginpage1;

public class LoginApp extends BaseClass {

	@Test
	public void loginApp() {

		Loginpage1 login = new Loginpage1(driver);

		login.enterEmail("rushabh@gmail.com");

		login.enterPassword("Rushabh@12345");

		login.clickSubmit();

	}

}
