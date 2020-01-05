
package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	@Test
	public void tc001_LoginLogout() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin();

	}
}
