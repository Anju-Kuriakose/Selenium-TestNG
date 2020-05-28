package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupCase1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>  it=handles.iterator();
		
		String parentwindowId=it.next();
		System.out.println("Parent window id is : "+parentwindowId);
		
		String childwindowId1=it.next();
		System.out.println("child1 Window Id is :" +childwindowId1);
		driver.switchTo().window(childwindowId1);
		System.out.println("Child1 window title is :"+driver.getTitle());
		
		String childwindowId2=it.next();
		System.out.println("child2 Window Id is :" +childwindowId2);
		driver.switchTo().window(childwindowId2);
		System.out.println("Child2 window title is :"+driver.getTitle());
			
		String childwindowId3=it.next();
		System.out.println("child3 Window Id is :" +childwindowId3);
		driver.switchTo().window(childwindowId3);
		System.out.println("Child3 window title is :"+driver.getTitle());
		
		String childwindowId4=it.next();
		System.out.println("child4 Window Id is :" +childwindowId4);
		driver.switchTo().window(childwindowId4);
		System.out.println("Child4 window title is :"+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentwindowId);
		System.out.println("Parent window title is :"+driver.getTitle());
		
		
		
		
	}

}
