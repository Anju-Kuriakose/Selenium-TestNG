package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//get() method and navigate().to() both do the same ,the difference is shown in this example
		driver.get("https://www.google.ca");
		driver.navigate().to("https://www.amazon.ca");
		driver.navigate().to("https://www.msn.ca");
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().forward();
		//switching URLS or back and forward simulation in selenium using navigate().to() method
		driver.navigate().refresh();//refresh particular page
		
		
		//the difference between driver.get() and navigate().to() is:
		//1.when we launch the browser and it perform the action(load the elements like clicking button etc) once the page is completely loaded. 
		    //In navigate().to() method,it wont wait for the page to be loaded or not
		
		//2.Navigate().to() maintains a navigation history as it allows back and forward simulation (switching urls) but get() does not maintain a history
		

	}

}
