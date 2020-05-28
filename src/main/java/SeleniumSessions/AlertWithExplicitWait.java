package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		ElementUtil elementUtil = new ElementUtil(driver);

		By clickForJSAlert = By.xpath("//button[text()='Click for JS Alert']");

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		// elementUtil.waitForElementToBeClickable(clickForJSAlert, 5).click();
		elementUtil.clickWhenReady(clickForJSAlert, 5);

		Alert alert = elementUtil.waitForAlertToBePresent(5);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	}

}
