package homeAssignments_Week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

public class Create_Account {
	
	public static void main(String[] args) { ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/main");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//TestCase 1: Login to leaftabs

	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	driver.findElement(By.id("password")).sendKeys("crmsfa"); driver.findElement(By.xpath("//input[@type='submit']")).click();

	driver.findElement(By.xpath("//div[@id='label' and @for='crmsfa']")).click();

	//TC: click on accounts

	driver.findElement(By.xpath("//a[text()='Accounts']")).click();

	driver.findElement(By.xpath("//a[text()='Create Account']")).click(); driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Test_9876");

	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");

	WebElement industryid=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	Select selectIndId= new Select(industryid);
	selectIndId.selectByVisibleText("Computer Software");

	WebElement ownership= driver.findElement(By.xpath("//select[@name='ownershipEnumId']")); 
	Select selectownership =new Select(ownership);
	selectownership.selectByVisibleText("S-Corporation");

	WebElement source =driver.findElement(By.xpath("//select[@name='dataSourceId']")); 
	Select selectsource= new Select (source);
	selectsource.selectByValue("LEAD_EMPLOYEE");

	WebElement marketing= driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
	Select selectmarketing =new Select (marketing);
	selectmarketing.selectByIndex(6);

	WebElement state =driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select selectstate= new Select(state); 
	selectstate.selectByValue("TX");
	
	driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	WebElement verifyAcctname=driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]"));

	verifyAcctname.getText();

	if (verifyAcctname.getText().contains("Test")) {
		System.out.println("Added account id is present with prefix Test");
		
	}else { 

	 System.out.println("Added account id is not present with prefix Test");
	}
	driver.close();
	
	}

}
