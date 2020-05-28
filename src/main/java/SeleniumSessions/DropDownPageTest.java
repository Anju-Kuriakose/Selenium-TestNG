package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPageTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		By dropdown = By.id("dropdown");
		
		ElementUtil elementUtil = new ElementUtil(driver);
				
		elementUtil.doSelectByVisibleText(dropdown, "Option 2");

	}

}
