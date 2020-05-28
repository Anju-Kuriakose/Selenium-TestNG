package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		//scenario is check google title
		//launch chrome  >enter url > verify google title > close browser
		
		//automation steps:
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");//set up chromedriver.exe file 
        WebDriver driver=new ChromeDriver(); //launch chrome 
        
        //To launch firefox and import firefox driver
        
       // System.setProperty("webdriver.gecko.driver", "C:\\apps\\geckodriver.exe");//set up geckodriver.exe file 
        //WebDriver driver=new FirefoxDriver(); //launch firefox
        
        
        driver.get("http://www.google.com");//Enter url
       
        //to get the title 
        String title=driver.getTitle();//get title
        System.out.println("Page title is:" + title);
        
        
        //To verify if this is the right title or not-verification point or check point//automation testing actually starts from here
        
        if(title.equals("Google")) {
        	 System.out.println("correct title");
        }
        else {
        	 System.out.println("wrong or incorrect title");
        }
        
        //to see the current url and verify if it is correct url or not
        
        System.out.println(driver.getCurrentUrl());
        
        String url=driver.getCurrentUrl();
        if(url.contains("google")) {
        	System.out.println("correct url");
        	}
        else {
        	System.out.println("Incorrect url");
        }
        
       // System.out.println(driver.getPageSource());//to see the page source
        
        //driver.quit();//closes all the browsers opened by the selenium script
        
        driver.close();//closes the current browser
	}

}
