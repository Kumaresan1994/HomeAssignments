package homeAssignments_Week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonCart {

		public static void main(String[] args) throws IOException, InterruptedException { 
			ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys ("oneplus 9 pro", Keys.ENTER);

		//Get the price of the first product

		String PriceofFirstProduct = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText(); 
		System.out.println("Price of first product: "+PriceofFirstProduct);

		//Print the number of customer ratings for the first displayed product

		String RatingOfFIrstProduct=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text']) [2]")).getText(); 
		System.out.println("Product Rating: "+RatingOfFIrstProduct);

		//Click the first text link of the first image

		WebElement ClickFirstLink = driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[2]"));

		System.out.println("Print first link name: "+ClickFirstLink.getText());

		ClickFirstLink.click();

		//Switch to Second window

		Thread.sleep(2000);
		Set<String> Switchwindow =driver.getWindowHandles ();

		List<String> SwitchWindowList =new ArrayList<>(Switchwindow);

		driver.switchTo().window(SwitchWindowList.get(1));
		
		// Take a screenshot of the product displayed 
		File scr =driver.getScreenshotAs (OutputType.FILE);
		File dst=new File("./SnapShot/img1.png");
		FileUtils.copyFile(scr, dst);
	
		
		//Click the 'Add to Cart' button

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 

		//Get the cart subtotal and verify if it is is correct
		String CartSubTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		if (CartSubTotal.contains(PriceofFirstProduct)) {

		System.out.print("Cart subtotal is displayed :::"+CartSubTotal);}

		else {
		System.out.println("Cart subtotal is not displayed ");
		}

		driver.quit();

	}
	}


