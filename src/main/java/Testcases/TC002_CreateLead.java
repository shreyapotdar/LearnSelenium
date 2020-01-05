package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{
@Test
	
	public void tc002() {
		// TODO Auto-generated method stub
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickCreateLead()
		.EnterCname()
		.EnterFname()
		.EnterLname()
		.clickSubmit();

	}
}
