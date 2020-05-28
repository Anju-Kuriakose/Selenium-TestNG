package SeleniumSessions;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.facebook.com/");

		String date = "13-May-1990";

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		By daysOptions = By.xpath("//select[@id='day']/option");
		By monthOptions = By.xpath("//select[@id='month']/option");
		By yearOptions = By.xpath("//select[@id='year']/option");


		// List<WebElement> optionsList =
		// driver.findElements(By.xpath("//select[@id='day']/option"));
		//
		// for (int i = 0; i < optionsList.size(); i++) {
		// String text = optionsList.get(i).getText();
		// System.out.println(text);
		// if (text.equals("25")) {
		// optionsList.get(i).click();
		// break;
		// }
		// }
		
		List<String> ls = doSelectDropDownValueWithoutSelect(driver, "//select[@id='day']/option", date.split("-")[0]);
		System.out.println(ls);
		doSelectDropDownValueWithoutSelect(driver, "//select[@id='month']/option", date.split("-")[1]);
		doSelectDropDownValueWithoutSelect(driver, "//select[@id='year']/option", date.split("-")[2]);
		
//		ElementUtil el = new ElementUtil(driver);
//		el.doSelectDropDownValueWithoutSelect(daysOptions, date.split("-")[0]);
//		el.doSelectDropDownValueWithoutSelect(monthOptions, date.split("-")[1]);
//		el.doSelectDropDownValueWithoutSelect(yearOptions, date.split("-")[2]);

	}

	public static List<String> doSelectDropDownValueWithoutSelect(WebDriver driver, String xpathValue, String value) {
		List<WebElement> optionsList = driver.findElements(By.xpath(xpathValue));
		return null;
		
		 //List<String> list = optionsList.stream().map(WebElement::getText).collect(Collectors.toList());
		 //return list;

		
//		for (int i = 0; i < optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			//System.out.println(text);
//			if (text.equals(value)) {
//				optionsList.get(i).click();
//				break;
//			}
//		}
	}

}