package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Loginpage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/login");

		Thread.sleep(3000);

		// Create object of LoginPage Class
		Loginpage login = new Loginpage(driver);

		login.enterEmail("rushabh@gmail.com");
		System.out.println("User has entered email");
		Thread.sleep(3000);

		login.enterPassword("Rushabh@12345");
		System.out.println("User has entered Password");
		Thread.sleep(3000);

		login.clickSubmit();
		System.out.println("User has clicked on Submit button");

		System.out.println("Execution Successful");
		Thread.sleep(3000);

		driver.close();
	}

}
