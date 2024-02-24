package homeAssignments_Week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to Ajio website
		driver.get("https://www.ajio.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter seach value as bags
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(3000);
		
		//Get the item count displayed after selecting the filters
		WebElement Getitemscount =driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']"));

		String [] GetcountSplit =Getitemscount.getText().split(" ");

		List<WebElement> GetBrands= driver.findElements(By.xpath("//div[@class='brand']"));

		List<WebElement> GetBagsList =driver.findElements(By.xpath("//div[@class='nameCls']"));

		List<String> GetBrandsName = new ArrayList<String>(); List<String> GetBagNames = new ArrayList<String>();
		//Use foreach loop print the brand name and bags name list
		for (WebElement GetBrandlist : GetBrands) {

			String GetBrandNamelist =GetBrandlist.getText(); 
			GetBrandsName.add(GetBrandNamelist);

			}

			for(WebElement GetBagNamelist : GetBagsList) {
			String GetBagsLists= GetBagNamelist.getText(); 
			GetBagNames.add(GetBagsLists);

			}

			System.out.println("Get items count: "+GetcountSplit[0]);
			System.out.print("Brands name list: "+GetBrandsName+",");
			System.out.println("\n");

			System.out.print("Bags name list: "+GetBagNames+",");

			driver.close();
	}

}
