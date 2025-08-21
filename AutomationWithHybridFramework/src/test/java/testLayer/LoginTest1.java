package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Loginpage1;

public class LoginTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/login");

		Thread.sleep(3000);
		
		// Create object of Loginpage1 class
		Loginpage1 login1 = new Loginpage1(driver);

		login1.enterEmail("rushabh@gmail.com");
		Thread.sleep(3000);
		
		login1.enterPassword("Rushabh@12345");
		Thread.sleep(3000);
		
		login1.clickSubmit();

		System.out.println("Execution Completed");
		Thread.sleep(3000);
		
		driver.close();

	}

}
