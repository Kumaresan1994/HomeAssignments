package homeAssignments_Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		
		
		driver.findElement(By.xpath("//a[contains(.,'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Create Lead')]")).click();
		
		//enter values
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestChrome");
		
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dinesh");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kumar_localNM");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("FRM");
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("FRM Department");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Test@gmail.com");
		
		WebElement State=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		
		Select selectstate = new Select(State);
		selectstate.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(4000);
		//Edit lead scenario
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Add important notes");
		
		
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
