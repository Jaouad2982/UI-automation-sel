import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Executor {
	public static void main(String[]args) {
	String url = "https://rahulshettyacademy.com/AutomationPractice/";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll");
	js.executeScript("document.querySelector(\"div.tableFixHead\").scrollTop");
	System.out.println(loopthroughTableGetSum(driver,url));
	
	
}
	
	public static int loopthroughTableGetSum(WebDriver d,String url) {
		List<WebElement> elem = d.findElements(By.cssSelector("tbody tr td:nth-child(4)"));
		int sum = 0;
		for(WebElement el:elem) {
			 sum = sum + Integer.parseInt(el.getText());
		}
		return sum;
	}
}