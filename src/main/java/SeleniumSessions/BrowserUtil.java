package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {//create the utility functions to use the browser properly
	 
	WebDriver driver ;
	
	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browserName
	 * @return driver
	 */
	
	 
	 public WebDriver init_driver(String browserName) {
		 //we create a method so that we can create object,call the method and initialize the browser on the basis of browser name passing
		 
		switch(browserName) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		      break;
		
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			
		driver=new FirefoxDriver();
		break;
		
		default:
			System.out.println(browserName + "browser not found");
		break;
	}
		
		return driver; //return type is WebDriver so it replaces void with WebDriver in the method
	}

	public void launchUrl(WebDriver driver,String Url) {
		driver.get(Url);
	}
	public String doGetTitle() {
		
		return driver.getTitle();
	}
	
	public void doQuitBrowser() {
		driver.quit();
		
	}
	//in case if browser is not available to launch the url we can use navigate() to()
	public void navigateToUrl(String Url) {
		driver.navigate().to(Url);
	}
}



	

