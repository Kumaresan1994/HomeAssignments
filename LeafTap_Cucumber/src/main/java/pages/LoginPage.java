package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	@When ("Enter the UserName as {string}")
	public LoginPage enterUserName(String Username) throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(Username);
			reportStep("pass", "Username entered Sucessfully");
		} catch (Exception e) {
			
			reportStep("fail", "unable to enter Username"+e);
		}
		return this;
	}
	@And ("Enter the password as {string}")
	public LoginPage enterPassword(String password) throws IOException {

		try {
			getDriver().findElement(By.id("password")).sendKeys(password);
			reportStep("pass", "Password entered Sucessfully");
		} catch (Exception e) {
			reportStep("fail", "unable to enter Password"+e);
		}
		return this;
	}
	@And ("Click on the Login Button")
	public HomePage ClickLogin() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("pass", "Login Sucessful");
		} catch (Exception e) {
		
			reportStep("fail", "unable to Login"+e);
		}
		return new HomePage();
	}
	@Then ("Home Page should be displayed")
	public void verifyHomePage() {

		String title = getDriver().getTitle();

		if(title.contains("Automation")) {


			System.out.println("Login Sucessful");
		}else {

			System.out.println("Login not Sucessful");
		}

}}
