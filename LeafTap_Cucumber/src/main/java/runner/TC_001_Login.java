package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_Login extends BaseClass{
	
	@BeforeTest
	public void setData(){
		
		filedata = "CreateLead";
		
	}
	@Test(dataProvider ="getdata")
	public void login(String cmpName,String fName,String lastName,String ph) throws IOException {
	LoginPage lp = new LoginPage();
	lp.enterUserName("DemoSalesManager").enterPassword("crmsfa")
	.ClickLogin().clickcrmsfa()
	.clickOnLeadsLink().clickOnCreateLead().enterCompanyName(cmpName).enterFirstName(fName)
	.enterLastName(lastName).enterPhone(ph)
	.clickCreatLeadSubmit();

}}
