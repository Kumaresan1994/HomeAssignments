package runner;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Logout extends BaseClass{
	@Test
	public void logout() throws IOException {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName("demosalesmanager").enterPassword("crmsfa")
		.ClickLogin().clickLogOut();
	}

}
