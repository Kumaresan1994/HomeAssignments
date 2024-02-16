package homeAssignments_Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("P45456");
		driver.findElement(By.name("lastname")).sendKeys("Surename");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8489578148");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@1234");
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		Select selectday = new Select(day);
		selectday.selectByValue("23");
		
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("Jan");
		
		Select selectyear = new Select(year);
		selectyear.selectByValue("2005");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.getTitle());
		driver.close();
	}


	}


