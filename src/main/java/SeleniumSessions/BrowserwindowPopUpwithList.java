package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserwindowPopUpwithList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		List<String>  hList=new ArrayList<String> (handles);//list is used to get the window id ,can use iterator,loop etc
		
		System.out.println(hList.size());//total no of windows opened
		
		String parentwindowId=hList.get(0);
		String childwindowId=hList.get(1);
		
		System.out.println(parentwindowId);
		System.out.println(childwindowId);
		
		driver.switchTo().window(childwindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(parentwindowId);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
     driver.quit();

		

	}

}
