package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	@BeforeMethod
	public void loginBrowser() {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();


		// Initiate the ChromeBroswer
		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@AfterMethod
	public void exit() {
		driver.close();
	}

}