package SeleniumSessions;
//i18n-string[text()='Forgot my password']
public class CustomXpath {

	public static void main(String[] args) {
		
	//1.	//we make our own custom path based on attributes available
		
		//htmltag[@property='value'] //look for the unique property of the webelement
		
		//input[@id='username']
		
		//input[@type='email']
		
		//if using 2 properties together,use AND operator
		//htmltag[@property1='value  and @property2='value']
		
		//input[@id='username' and @type='email']
		
		//input[@id]
		//input[@id and @type]
		
		//input[@id='password' and @type='password']
		
//2.   based on index ,in case of multiple elements with the same id attribute
//      (//htmltag[@property])[1] -it will go to the first element
//		(//input[@id])[1]
		
//classic.crmpro.com
		
		//input[@name='username']
		//input[@placeholder='Username' and @type='text' and @class='form-control']
		
//3.Xpath using class- 2 objects with same class,we need to get the first positioned element
		
//       (//input{@class='form-control']) [1]
		
		//or use position() function 
		
//		(//input[@class='form-control'])[position()=1]
		
//4.xpath using parent tags
		
		//div//input[@id='username'] -shows direct and indirect child elements
		
		//div/input[@id='username']=only shows direct child elements
		
//     (//ul [@class='footer-nav'])/li   //to access all the 29 elements in ul DOM
//     (//ul[@class='footer-nav'])[2]/li -to get the second element		
		
		
	}

}
