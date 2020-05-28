package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpWithListCase2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		List<String>  hList=new ArrayList<String> (handles);
		
        System.out.println(hList.size());//total no of windows opened
		
		String parentwindowId=hList.get(0);
		String childwindowId1=hList.get(1);
		String childwindowId2=hList.get(2);
		String childwindowId3=hList.get(3);
		String childwindowId4=hList.get(4);
		
				
		driver.switchTo().window(childwindowId1);
		System.out.println("child1 window id is:" +childwindowId1);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		driver.switchTo().window(childwindowId2);
		System.out.println("child2 window id is:" +childwindowId2);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		driver.switchTo().window(childwindowId3);
		System.out.println("child3 window id is:" +childwindowId3);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		driver.switchTo().window(childwindowId4);
		System.out.println("child4 window id is:" +childwindowId4);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(parentwindowId);
		
		//driver.close();
		
	}

}
