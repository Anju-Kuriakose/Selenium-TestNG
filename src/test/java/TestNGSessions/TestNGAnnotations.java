package TestNGSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
	
	 @BeforeSuite
	  public void createConnectWithDatabase() {
		 System.out.println("Connect with Datatbase");
	  }
	 
	 @BeforeTest
	  public void createUser() {
		 System.out.println("create user");
	  }
	 @BeforeClass
	  public void launchBrowser() {
		 System.out.println("launch browser");
	  }
	 
	 @BeforeMethod
	  public void loginToApp() {
		 System.out.println("login to app");
	  }
  @Test
  public void verifyTitleTest() {
	  System.out.println("verify title test");
  }
  @Test
  public void verifyLoggedInUser() {
	  System.out.println("verify logged in user");
  }

  @AfterMethod
  public void logout() {
	  System.out.println("log out");
  }

  

  @AfterClass
  public void closeBrowser() {
	  System.out.println("close the browser");
  }

 
  @AfterTest
  public void deleteUser() {
	  System.out.println("delete the user");
  }

 

  @AfterSuite
  public void disconnectDatabase() {
	  System.out.println("disconnect datatbase");
  }

}
