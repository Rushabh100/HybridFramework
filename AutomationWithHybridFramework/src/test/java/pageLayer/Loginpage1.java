package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {

	// POM using PageFactory

	WebDriver driver;

	// Declare constructor
	public Loginpage1(WebDriver driver) {
		System.out.println("LoginPage1 Constructor started");

		this.driver = driver;

		// To initialise the elements in the webpage
		PageFactory.initElements(driver, this);

	}

	// Locate the elements
	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "submit")
	WebElement submit;

	// Create methods to implement the elements

	// Method to enter email
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
		System.out.println("Entered Email");
	}

	// Method to enter password
	public void enterPassword(String pass) {
		password.sendKeys(pass);
		System.out.println("Entered Password");
	}

	// Method to click on Submit button
	public void clickSubmit() {
		submit.click();
		System.out.println("Clicked on Submit button");
	}

}
