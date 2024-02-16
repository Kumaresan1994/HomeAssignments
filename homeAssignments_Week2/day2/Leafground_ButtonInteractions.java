package homeAssignments_Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_ButtonInteractions {

	public static void main(String[] args) throws InterruptedException { 

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/button.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[text()='Click']")).click();

		String verifytitle= driver.getTitle();

		if(verifytitle.contains("Dashboard")) {

			System.out.println("Title is matched");
				} else {

			System.out.println("Title is not matched");}

			driver.navigate().back();

			Thread.sleep(2000);

			//Check if the button with the text 'Confirm if the button is disabled' is disabled.

			Boolean verifydisabled =driver.findElement(By.xpath("//div[@class='card'][contains(.,'Confirm if the button is disabled.Disabled')]/button")).isEnabled();

			System.out.println("Button enabled status is: "+verifydisabled);

			//Find and print the position of the button with the text 'Submit."

			WebElement buttonlocation=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));

			System.out.println("ButtonLocation: "+buttonlocation.getLocation());

			//Find and print the background color of the button with the text 'Find the Save button color.

			WebElement buttoncolor=driver.findElement(By.xpath("//span[text()='Save']"));

			System.out.println(buttoncolor.getCssValue("background-color"));

			//String hex =Color.fromString(color).asHex(); //System.out.println(hex);

			//Find and print the height and width of the button with the text 'Find the height and width of this button."

			WebElement buttonHeight=driver.findElement(By.xpath("//span[text()='Image']"));

			System.out.println("buttonHeightAndwidth: "+buttonHeight.getSize().getHeight()+":"+buttonHeight.getSize().getWidth());

			driver.close();

		}}
