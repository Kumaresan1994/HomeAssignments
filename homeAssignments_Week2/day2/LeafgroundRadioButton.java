package homeAssignments_Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeafgroundRadioButton {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/radio.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();

		//Select checkbox again

		WebElement unselect=driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		unselect.click(); Thread.sleep(2000);
		unselect.click();
		Boolean checkunselected =unselect.isEnabled();
		System.out.println("Check box not selected: "+checkunselected);

		//Find the default select radio button

		Boolean chkboxdefault =driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isEnabled();
		System.out.println("Check box is selected: "+chkboxdefault);

		//Check and select the age group
		Boolean checkagegroup=driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]")).isEnabled(); System.out.println("Age group check box is selected: "+checkagegroup);

		driver.close();

	}

}
