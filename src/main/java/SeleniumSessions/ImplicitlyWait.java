package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//will be applied for all the elements by default -- 15 secs  one by one e1 e2 e3.....e100
		//global wait
		
		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(15000);
		//can override the implicit wait
		
		driver.findElement(By.id("username")).sendKeys("naveen");
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//e4 e5  e6 -- home page
//	
//		//nullify imp wait:
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//
//		//e7 e8 e9
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}
