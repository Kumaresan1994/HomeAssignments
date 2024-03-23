package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage clickOnCreateLead() {

		getDriver().findElement(By.linkText("Create Lead")).click();
		return this;
	}
	public CreateLeadPage enterCompanyName(String cmpName) {

		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cmpName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {

		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	public CreateLeadPage enterLastName(String lastName) {

		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public CreateLeadPage enterPhone(String ph) {

		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		return this;
	}
	public MyLeadsPage clickCreatLeadSubmit() {

		getDriver().findElement(By.name("submitButton")).click();
		return new MyLeadsPage();
	}
}
