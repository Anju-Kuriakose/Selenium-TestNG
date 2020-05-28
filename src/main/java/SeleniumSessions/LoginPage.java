package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_driver("chrome");
		
		br.launchUrl(driver,"https://app.hubspot.com/login");
		Thread.sleep(5000);


		String title=br.doGetTitle();
		System.out.println("title of the page  is :" +title);
         
         By emailID=By.id("username");
         By password=By.id("password");
         By loginButton=By.id("loginbtn");
         By header=By.cssSelector("h1.private-page__title");
                 
         ElementUtil el=new ElementUtil(driver);
         el.doClick(loginButton);
         
         
         el.doSendKeys(emailID, "naveenanimation30@gmail.com");
         el.doSendKeys(password, "Test@1234");
         
        // driver.findElement(loginButton).isDisplayed();//to check whether the element is displayed or not ;output is boolean true or false ,when not displayed
             if( el.doIsDisplayed(loginButton)) {
	                              el.doClick(loginButton);
                                    }
         
         
         Thread.sleep(5000);
        String headerText= el.doGetText(header);
        System.out.println("homepage header is :" +headerText);
                
         br.doQuitBrowser();
	}

}
