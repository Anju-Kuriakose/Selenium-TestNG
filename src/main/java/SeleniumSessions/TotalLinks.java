package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		//Get total no of links in the page
		//print the text of each link(avoid blank texts)
  //Print the href property of each link
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
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
		
		
	}

}
