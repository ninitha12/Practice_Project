package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Page {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		Actions act = new Actions(driver);
		//move to element
		act.moveToElement(driver.findElement(By.id("Stats1"))).perform();
		String prprice = "";
		String productName = "Streaming Device";
		//product name
		boolean b = false;
		//pages list
		List<WebElement> pagenum = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		for (WebElement pages : pagenum) {
			pages.click();
			Thread.sleep(1000);
			//products
			List<WebElement> prods = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
			
//              for (WebElement pr : prods) {
//            	  //checking product
//              if (pr.getText().equals(productName)) {
//              driver.findElement(By.xpath("//tbody//td[contains(.,'"+productName+"')]/following-sibling::td/input[@type='checkbox']")).click();
//              Thread.sleep(1000);
//            //tbody//td[contains(.,'"+productName+"')]/following-sibling::td/input[@type='checkbox']
//					prprice = driver.findElement(By.xpath("//td[.='"+productName+"']/following-sibling::td[1]")).getText();
//					b = true;
//					break;
//				}
//			}
//			if (b)
//				break;
//		}
//		System.out.println("Price of " + productName + " is= " + prprice);

		driver.quit();

	}

}