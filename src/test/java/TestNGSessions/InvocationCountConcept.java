package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {//practical use in API automation,to generate load on system,if we want to execute the same tests 10 times
	
	@Test(invocationCount = 10)//here its 10 times 
	public void googleTest(){
		System.out.println("google test");
	}
}
