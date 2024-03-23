package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	

	public CreateLeadPage clickOnCreateLead() throws IOException {
		
		try {
			getDriver().findElement(By.linkText("Create Lead")).click();
			reportStep("pass", "Able to click leads link");
		} catch (Exception e) {
			reportStep("fail", "Unable to click leads link"+e);
		}
		return new CreateLeadPage();
	}
	
	public void clickOnFindLeads() {
		
		getDriver().findElement(By.linkText("Find Leads")).click();
	}

}
