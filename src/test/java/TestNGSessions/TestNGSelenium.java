package TestNGSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;




public class TestNGSelenium {

	WebDriver driver;


@BeforeTest
public void setUp() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	
	driver.get("https://app.hubspot.com/login");
}
@Test
public void verifyloginPageTitleTest() {
	String title=driver.getTitle();
	System.out.println("title of the page is :" +title);
	Assert.assertEquals(title, "Hubspot Login");
}
@Test

public void verifySignUpLinkText() {
	Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
	}
@Test

public void loginTest() {
	driver.findElement(By.id("username")).sendKeys("test@gmail.com");
	driver.findElement(By.id("password")).sendKeys("test@123");
	driver.findElement(By.id("loginBtn")).click();
	
}


@AfterTest
public void tearDown() {
	driver.quit();
}

}
