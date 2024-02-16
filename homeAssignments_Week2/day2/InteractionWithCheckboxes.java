package homeAssignments_Week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver; 

public class InteractionWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//TestCase 1 click on the "Basic Checkbox

		WebElement Basic=driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));

		Basic.click();

		Basic.isSelected();

		//testCase 2 Click on the "Notification Checkbox

		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();

		String checkmsg=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();

		if(checkmsg.contains("Checked")) {

			System.out.println("Expected message displayed");
		}
		else {

			System.out.println("Expected message is not displayed");
		}
		//TestCase 3: Click on your favorite language

		WebElement language=driver.findElement(By.xpath("(//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td/div)[1]"));

		language.click();
		language.isSelected();

		Thread.sleep(3000);

		//TestCase 4: click on the "Tri-State Checkbox
		WebElement tricolour=driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]')]"));

		tricolour.click();

		String tricolourstate=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();

		if(tricolourstate.contains("state= 1"))
		{

			System.out.println("State 1 message displayed");
		}

		else { System.out.println("other state message displayed");

		//testcase 5: click on the "Toggle Switch" working
		Thread.sleep(2000);
		WebElement toggleswitch=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));

		toggleswitch.click();

		String toggleswitchmsg=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();

		if(toggleswitchmsg.contains("Checked")) {

			System.out.println("Expected message displayed for toggleswitch");}

		else {

			System.out.println("Expected message is not displayed for toggleswitch");}

		//testCase 6: Verify if the Checkbox is disabled
		Boolean disabledcheckbox=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println("Button enabled Status is : "+disabledcheckbox);

		//TC 7 Select multiple options on the page

		WebElement Selectmultiple=driver.findElement(By.xpath("//div[@role='combobox']"));

		Selectmultiple.click();

		WebElement checkbox=driver.findElement(By.xpath("//div[contains(@class,'ui-widget-header ui-corner-all ui-selectcheckboxmenu-header ui-helper-clearfix')]/div[@class='ui-chkbox ui-widget']"));

		checkbox.click();

		System.out.println(driver.getTitle());

		driver.close(); Thread.sleep(3000);

		}}}
