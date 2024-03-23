package pages;

import java.io.IOException;

import org.openqa.selenium.By;


import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	
	
	public MyLeadsPage clickOnLeadsLink() throws IOException {
		try {
			getDriver().findElement(By.linkText("Leads")).click();
			reportStep("pass", "Able to click leads link");
		} catch (Exception e) {
			reportStep("fail", "Not Able to click leads link"+e);
		}
		return new MyLeadsPage();
	}

}
