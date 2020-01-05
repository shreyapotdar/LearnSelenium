package Pages;

import Base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public MyHomePage clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
}
