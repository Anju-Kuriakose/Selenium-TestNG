package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		Actions action=new Actions(driver);

		WebElement login=driver.findElement(By.xpath("//*[@id=\'ctl00_HyperLinkLogin\']	"));
			
		action.moveToElement(login).build().perform();
		
		driver.findElement(By.linkText("Member Login")).click();
		
	//driver.findElement(By.xpath("//*[@id=\'menu-list-login\']")).click();
	
	//action.moveToElement(list);
	
	//driver.findElement(By.id("spiceclub-login")).click();
		
		
		
		
		
	}

}
