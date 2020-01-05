package Pages;

import Base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyLeadPage clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}
}
