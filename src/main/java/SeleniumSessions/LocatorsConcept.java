package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException { //we have given sleep statemnet in the script and it throws exceprion
		
		//Web element are elements which is available on web page such as text box,check boxes,links,buttons,images etc
		
		//create the web element and perform actions on the particular web element
		//Web element actions----> click(click on the links or buttons),sendKeys(to pass some values to a particular field),getText(to get the text from that element)
		
		//to create the web element,locators are used ,8 different types of locators in Selenium in By class
		
		 System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://app.hubspot.com/login");
	       Thread.sleep(5000);//pause the script for 5 secs and by that time your page will be fully loaded
	       
		//login page is opened and if we want to enter some values we need to INSPECT that element
	       //but we can not inspect the title or backward and forward arrows of the page  because the scope of inspect is within the page.
		
//the entire html elements are called DOM(Document Object Model) -complete html code of the page
	       
	       //syntax of dom <input id="username" ------> <input is the html tag ,id is the Attribute ,"username" is the value of the id Attribute
	       //we use some of these attributes to create a web element
	      
	       //1.id -are unique -1st preference
	       
	       //CASE1:
	       //driver.findElement(By.id("username")).sendKeys("test@gmail.com");// username text box
	       //driver.findElement(By.id("password")).sendKeys("test@1234");//password text box
	      // driver.findElement(By.id("loginBtn")).click();//login button
	       
	       
	       //second approach to create a web element
	       //CASE 2: This approach has a reusability factor.
	      /* WebElement emailId=driver.findElement(By.id("username"));
	       WebElement password=driver.findElement(By.id("password"));
	       WebElement loginButton=driver.findElement(By.id("loginBtn"));
	       
	       emailId.sendKeys("test@gmail.com");
	       password.sendKeys("test@123");
	       loginButton.click();*/
	       
	      //CASE 3: By locators ( we can not perform send keys or click using by locators)
	       //created by locators
	       
	     /*  By email=By.id("username");
	   By password=  By.id("password");
	   By loginButton=By.id("loginBtn");
	   
	   //using the by locators we created web elements
	   WebElement emailId=driver.findElement(email);
	   WebElement pwd=driver.findElement(password);
	   WebElement login=driver.findElement(loginButton);
	   
	   //with that web element perform the actions
	  
	   emailId.sendKeys("test@gmail.com");*/
	   
	   //CASE 4: STRING LOCATORS
	   //create a string locator then create a by locator and then perform the actions
	  // String emailId="username";
	   
	   
	  // By email1=By.id(emailId);
	   
	   
	 //  driver.findElement(email1).sendKeys("test@gmail.com");
	   
	   
	   
	       //2.name (if id is available for a particular web elemnt then pick id otherwise pick name(2nd preference))
	       
	       //driver.findElement(By.name("username")).sendKeys("test");
	       
	       //3.className -3rd preference
	       
	       //driver.findElement(By.className(" form-control private-form__control login-email").sendKeys("test@gmail.com");//its a long class name  it will give an classnotfound exception
	       
	       //we must use a single class name or  a unique class name
	       
	       //driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
	       
	     //4.xpath -is the address of the element in HTML DOM but its not an attribute  -4th priority
	       
	       driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
	       
	      // inspect the element rtclick>copy>copy xpath  //*[@id="username"]  change the double quotes of username to single quotes
	                    
	      //*[@id="password"]-By.xpath("//*[@id='password']"
	       
	       
	       //5.CSS selector-is not an attribute-4th priority
	       //inspect the element rtclick>copy>copy selector
	       
	       driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
	       
	       //6.linkText -only for links ,all links associated with a tag <a href ,pass the text of the object,
	       
	       driver.findElement(By.linkText("Sign up")).click();
	       
	       //7.Partial LinkText -only for links and we  pass partial text 
	       
	       driver.findElement(By.partialLinkText("sign")).click();
	       
	       
	       //8.tagName (html tag name to be passed)-5th priority
	       
	       //h1 is the first heading and h2 is  the sub headings on a page 
	       //we can have multiple h2 values but only a single h1
	     String header=  driver.findElement(By.tagName("h1")).getText(); //to capture the text of the element
	       System.out.println(header);
	       
	       String linkText=driver.findElement(By.linkText("Platform")).getText();
	       
	       System.out.println(linkText);
	       
	       //most of all the locators works on all browsers.
	      
	}

}
