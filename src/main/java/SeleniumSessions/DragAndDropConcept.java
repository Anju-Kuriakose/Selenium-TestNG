package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		//user actions:
				//1. drag n drop
				//2. right click
				//3. movetoElement
				//4. click and sendKys
				//5. double click
				
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
				driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
				
				WebElement sourceEle = driver.findElement(By.id("draggable"));
				WebElement targetEle = driver.findElement(By.id("droppable"));

				Actions action = new Actions(driver);
				
				//action.dragAndDrop(sourceEle, targetEle).perform();
				
				action.
				clickAndHold(sourceEle).
				moveToElement(targetEle).
				release().
				build().
				perform();
				
				//1 action : build.perform
				//1 action : perform
				
				//multiple actions : no --- wont work
				//multiple actions : yes -- build.perform or .perform
						
	}

}
