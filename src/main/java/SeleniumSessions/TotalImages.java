package SeleniumSessions;

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		//Get total no of images in the page
				//print the text of each images(avoid blank texts)
		  //Print the src property of each image
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		java.util.List <WebElement> imagesList=driver.findElements(By.tagName("img"));
		
		System.out.println("total images :" +imagesList.size());
		
		//To print the text of each images
		
		for(int i=0;i<imagesList.size();i++) {
			String imgtext=imagesList.get(i).getAttribute("alt");
			
			if(!imgtext.isEmpty()){
				
			
			System.out.println(i+"-->"+imgtext);
			
			//to print the src properties of each images
			
			System.out.println(imagesList.get(i).getAttribute("src"));
			
			}	
			
		}
		
		
	}

}
