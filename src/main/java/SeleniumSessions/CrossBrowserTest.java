package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest { //with top casting we can achieve cross browser testing

	public static void main(String[] args) {
		
		String browser="chrome";
		WebDriver driver=null;
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\apps\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			//no need to set property for safari
			//for safari,go to develop menu,enable Remote control automation
			driver=new SafariDriver();
		}
	}

}
