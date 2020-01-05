package Pages;

import org.openqa.selenium.WebElement;

import Base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername() {
		WebElement username=driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterPassword() {
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		return this;
	}
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
