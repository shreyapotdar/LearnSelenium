package Pages;

import Base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
public ViewLeadPage verifyLead() {
	String fName = driver.findElementById("viewLead_firstName_sp").getText();
	if (fName=="Shreya") {
		System.out.println("Lead Created");
	}
	return this;
}
}
