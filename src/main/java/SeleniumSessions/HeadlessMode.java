package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {//execute the entire code without showing the browser but the url is launching internally
//output will be shown in the console without showing the browser,
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);//by passing co ,the url will open in headless mode
		
		//FirefoxOptions fo=new FirefoxOptions();
		//fo.addArguments("--headless");
		//WebDriver driver=new FirefoxDriver(fo);
		//if you want to execute in incognito window, co.addArguments("...incognito");
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
List<WebElement> linksList=driver.findElements(By.tagName("a"));//findElements() is used when to interact with multiple elements
		
		System.out.println("total links :" +linksList.size());
		
		//To print the text of each link ,we need to iterate each value of the links
		
		for(int i=0;i<linksList.size();i++) {
			String text=linksList.get(i).getText();
			
			//to verify all the links are valid or not /we do not want to print the blank links
			
			if(!text.isEmpty()) {//isempty is a boolean function to check whether the link is empty or not
				
			System.out.println(i+"--."+text.trim() );//this will print the indexing of each link 
			
			
			//to print the href property of each link
			
			System.out.println(linksList.get(i).getAttribute("href"));
	}
		}
}}
