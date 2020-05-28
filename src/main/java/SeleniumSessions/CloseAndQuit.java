package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
        
       System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
       WebDriver driver=new ChromeDriver(); //whenever we launch the browser a new session id is created and is passed to enter the url and every session till quitting the browser.
     //using driver after quit(),the output will be Session ID is null.NoSuchSessionException
       
        driver.get("http://www.google.com");
       String title=driver.getTitle();
      
      // driver.quit();// after quit(),no actions will be performed and the output will be Session ID is null.NoSuchSessionException,until unless create a new driver 
       
       driver=new ChromeDriver();
       driver.get("http://www.google.com");//if you are using the driver after quit a new session id is created
       System.out.println(driver.getTitle());
       
       
      driver.close();
      
      System.out.println(driver.getTitle());//output will be invalid session id or expired,after we try to get title after close() statement. To solve this problem,generate another session id
      
      
       //2nd difference is that;when using quit() it closes all the browsers opened by the selenium script irrespective of the focus of the driver.
      //when using close(),it will check where the driver is(current focus of the driver) and it will close that browser only
       
       
	}

}
