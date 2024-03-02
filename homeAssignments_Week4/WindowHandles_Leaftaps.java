package homeAssignments_Week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles_Leaftaps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//TestCase 1: Login to leaftabs

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa"); driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//div[@id='label' and @for='crmsfa']")).click();
		
		//TC: click on accounts

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//- Click on the widget of the "From Contact".
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		//Window handle for from contact
		
		Set<String> fromwindowHandle = driver.getWindowHandles();
		
		List<String> fromwindowHandles = new ArrayList<>(fromwindowHandle);
		driver.switchTo().window(fromwindowHandles.get(1));
		
		System.out.println("From Contact title : "+driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(fromwindowHandles.get(0));
		
		//- Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
				
		Set<String> TowindowHandle = driver.getWindowHandles();
		
		List<String> TowindowHandles = new ArrayList<>(TowindowHandle);
		driver.switchTo().window(TowindowHandles.get(1));
		
		System.out.println("To Contact title : "+driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		driver.switchTo().window(TowindowHandles.get(0));
		
		//Merge contacts
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert Acceptalert = driver.switchTo().alert();
		Acceptalert.accept();
		
		//Note: after accepting alert taking more time(approx 4 mins) load and timeout exception displayed
		//To avoid timeout ,commented the below line
		//System.out.println("Parent Window title : "+driver.getTitle());
		
		driver.close();
		

	}

}
