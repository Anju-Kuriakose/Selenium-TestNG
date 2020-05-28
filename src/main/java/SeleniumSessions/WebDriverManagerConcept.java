package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.firfoxdriver().setup(); for firefox browser
		//webDriverManager.getInstance(SafariDriver.class).setup();
		
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
	}

}
