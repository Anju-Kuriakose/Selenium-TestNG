package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp { //this is a desktop pop up

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*
		 sample of a file upload pop up
		 * Please fill in the file-upload form below
		File to upload: choose file button 
		Notes about the file: 


		press button  to upload the file!
		 */
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures");// give the path of the file to upload in sendKeys
		//this will work only when form contain an <input type="file"> element
		

	}

}
