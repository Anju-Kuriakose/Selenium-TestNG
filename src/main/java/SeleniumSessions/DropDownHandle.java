package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		// Select class to handle the dropdowns if Select html tag is there
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
				driver.get("http://the-internet.herokuapp.com/dropdown");

				WebElement dropdown = driver.findElement(By.id("dropdown"));
				//doSelectByVisibleText(dropdown, "Option 2");
				//doSelectByIndex(dropdown, 1);
				doSelectByValue(dropdown, "2");
			}

			public static void doSelectByVisibleText(WebElement element, String value) {
				Select select = new Select(element);
				select.selectByVisibleText(value);
				
			}
			
			public static void doSelectByIndex(WebElement element, int index) {
				Select select = new Select(element);
				select.selectByIndex(index);
				
			}
			
			public static void doSelectByValue(WebElement element, String value) {
				Select select = new Select(element);
				select.selectByValue(value);
				
			}

	}


