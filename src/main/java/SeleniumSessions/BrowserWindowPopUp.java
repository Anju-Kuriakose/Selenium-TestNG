package SeleniumSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp { //these are browser windows with title and a url .2.it is different from javascript popo ups
//these comes as a separate window
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click(); //child  window
		
		//To switch from main window to child window,we need a window id and that is unique,getwindowHandles() helps to get this id.
		
		
		Set<String> handles=driver.getWindowHandles();// To get the window handle of all the current windows.Set we need to import from java util library
		//String  handle= driver.getWindowHandle();To get the window handle of the current window.
		
		
	java.util.Iterator<String> it=handles.iterator();
	
	String parentwindowId =it.next();
	System.out.println("Parent Window Id is :" +parentwindowId);
	String childwindowId=it.next();
	System.out.println("child Window Id is :" +childwindowId);
		
		driver.switchTo().window(childwindowId);//switchTo()- WebDriver supports moving between named windows 
		System.out.println("child window title is : " +driver.getTitle());
		driver.close();//after closing the child window driver is lost,again we need to switch to the parent window
		
		driver.switchTo().window(parentwindowId);
		System.out.println("parent window title is : " +driver.getTitle());
		

	}

}
