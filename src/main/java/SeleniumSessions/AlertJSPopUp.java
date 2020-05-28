package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJSPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.name("proceed")).click();//inspect sign in button on the page
		Thread.sleep(5000);
		
		//Switch driver position to alert 
		
	Alert alert=driver.switchTo().alert(); //will return alert reference
	System.out.println(alert.getText());
	
	//alert.sendKeys(keystoSend); //refer the-internet.herokuapp.com/javascript_alerts
	
	alert.accept();//OK button, on the pop up to click
	//alert.dismiss(); //for cancel the pop up(cancel button)
	
	//or simply use esc to dismiss the alert
	
	
	}

}
