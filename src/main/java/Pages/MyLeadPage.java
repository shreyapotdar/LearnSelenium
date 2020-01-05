package Pages;

import org.openqa.selenium.WebElement;

import Base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	public MyLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return this;
	}
	public MyLeadPage EnterCname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("mphasis");
		return this;
	}

	public MyLeadPage EnterFname() {
		driver.findElementById("createLeadForm_firstName").sendKeys("shreya");
		return this;
	}

	public MyLeadPage EnterLname() {
		WebElement lastname=driver.findElementById("createLeadForm_lastName");
		lastname.sendKeys("potdar");
		return this;
	}
	public ViewLeadPage clickSubmit() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
}
