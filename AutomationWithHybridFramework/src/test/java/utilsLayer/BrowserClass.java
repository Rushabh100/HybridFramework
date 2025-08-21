package utilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserClass {

	public static WebDriver startApplication(WebDriver driver, String browserName, String Url) {

		if (browserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rushi\\eclipse-workspace\\AutomationWithHybridFramework\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./firefox");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver", "./IE");
			driver = new InternetExplorerDriver();
		}

		else {
			System.out.println("We do not support this browser");
		}

		// Maximize the browser
		driver.manage().window().maximize();

		// Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Pass the url
		driver.get(Url);

		return driver;
	}

	public static void quitBrowser(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

}
