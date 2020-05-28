package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		String date = "13-May-1990";

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		// ElementUtil el = new ElementUtil(driver);
		// el.doSelectByVisibleText(day, date.split("-")[0]);
		// el.doSelectByVisibleText(month, date.split("-")[1]);
		// el.doSelectByVisibleText(year, date.split("-")[2]);

//		Select selectday = new Select(driver.findElement(day));
//		List<WebElement> daysList = selectday.getOptions();
//		System.out.println(daysList.size());
//
//		for (int i = 0; i < daysList.size(); i++) {
//			String text = daysList.get(i).getText();
//			System.out.println(text);
//				if(text.equals("15")){
//					daysList.get(i).click();
//					break;
//				}
//		}

		// ArrayList<String> dayList = doGetDropDownOptions(driver, day);
		// System.out.println(dayList.size());
		// System.out.println(dayList);
		//
		// ArrayList<String> monthList = doGetDropDownOptions(driver, month);
		// System.out.println(monthList.size());
		// System.out.println(monthList);
		//
		// ArrayList<String> yearList = doGetDropDownOptions(driver, year);
		// System.out.println(yearList.size());
		// System.out.println(yearList);
		//
		// System.out.println("total options in day list box : "+
		// doDropDownOptionsCount(driver, day));
		// System.out.println("total options in month list box : "+
		// doDropDownOptionsCount(driver, month));
		// System.out.println("total options in year list box : "+
		// doDropDownOptionsCount(driver, year));

		doSelectDropDownValue(driver, day, "20");
		doSelectDropDownValue(driver, month, "Nov");
		doSelectDropDownValue(driver, year, "1987");

	}
	
	public static void doSelectDropDownValue(WebDriver driver, By locator, String value){
		Select selectday = new Select(driver.findElement(locator));
		List<WebElement> OptionsList = selectday.getOptions();
		//System.out.println(OptionsList.size());
		
		

		for (int i = 0; i < OptionsList.size(); i++) {
			String text = OptionsList.get(i).getText();
			//System.out.println(text);
				if(text.equals(value)){
					OptionsList.get(i).click();
					break;
				}
		}
	}

	public static int doDropDownOptionsCount(WebDriver driver, By locator) {
		return doGetDropDownOptions(driver, locator).size();
	}

	public static ArrayList<String> doGetDropDownOptions(WebDriver driver, By locator) {
		ArrayList<String> ar = new ArrayList<String>();
		Select select = new Select(driver.findElement(locator));
		List<WebElement> OptionsList = select.getOptions();

		for (int i = 0; i < OptionsList.size(); i++) {
			String text = OptionsList.get(i).getText();
			ar.add(text);
		}
		return ar;
	}

	}

