package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

		//Create object repository without PageFactory

	WebDriver driver;
	
	
		public Loginpage(WebDriver driver) {
			
			System.out.println("LoginPage Constructor");
			
			//this keyword is used to initialise the local driver
			//--> with the actual driver in test class
			this.driver = driver;
		}
		
		//Locate the elements
		By email = By.id("email");
		By password = By.id("password");
		By submit = By.id("submit");
		
		//Create non-static methods to initialise the elements
		
		//method to enter email ID
		public void enterEmail(String emailID) {
			driver.findElement(email).sendKeys(emailID);
		}
		
		//Method to enter password
		public void enterPassword(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		
		//Method to click on submit button
		public void clickSubmit() {
			driver.findElement(submit).click();
		}
		
		
		
		
	

}
