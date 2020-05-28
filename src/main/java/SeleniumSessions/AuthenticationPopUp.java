package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp { //These are not java script pop ups ,it needs authentication and is coming from the browser back end code

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//pass the values in the url

//Authentication pop up is something that come up with username,password,not javascript pop ups

String username="admin";
String password="admin";

driver.get("http://"+username+": "+password+" @"+"the-internet.herokuapp.com/basic_auth");



	}

}
