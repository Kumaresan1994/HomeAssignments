package homeAssignments_Week4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//go to snapdeal website
		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();
		//Get the sports shoes count
		String SportsShoesCount = driver.findElement(By.xpath("(//a[@class='child-cat-node dp-widget-link hashAdded']/div[@class='child-cat-count '])[2]")).getText();

		System.out.println("Men's Sports shoes count : "+SportsShoesCount);

		//Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		Thread.sleep(3000);

		//Sort the products by "Low to High".
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();

		driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']")).click();

		String VerifySorting = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();

		if(VerifySorting.contains("Price Low To High")) {

			System.out.println("Price Low To High Sorting Applied");
		}else {

			System.out.println("Sorting not Applied");
		}
		//Select any price range ex:(500-700).
		WebElement Fromvalue=driver.findElement(By.xpath("//input[@name='fromVal']"));
		Fromvalue.clear();
		Fromvalue.sendKeys("500");
	
		WebElement Tovalue=driver.findElement(By.xpath("//input[@name='toVal']"));
		
		Tovalue.clear();
		Tovalue.sendKeys("700");
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(3000);
	
		//Filter by any colour 
		driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile Black')]")).click();
		
		String FilterColour=driver.findElement(By.xpath("//div[contains(@class,'filters-top-selected')]//a[contains(@class,'')][normalize-space()='Black']")).getText();
		String FilterPrice=driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
		System.out.println(FilterColour+"::"+FilterPrice);
		//Verify filter applied by checking any one filter
		if(FilterColour.contains("Black")) {
			
			System.out.println("Filter Applied for black colour");
		}else {
			
			System.out.println("Filter not Applied for black colour");
		}
		//Mouse hover on the first resulting "Training Shoes".
		WebElement Clickimage=driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions movetoimage = new Actions(driver);
				
		movetoimage.moveToElement(Clickimage).perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(2000);
		
		//Print the cost and the discount percentage.
		String Cost= driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String Discountper= driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
				
		System.out.println("Product Cost: Rs "+Cost+"\n Discount Percentage : "+Discountper);
		
		driver.close();
		
	}
	
	
	
}
