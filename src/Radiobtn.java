import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiobtn {
	public static void main(String[]args) {
	String url = "https://rahulshettyacademy.com/AutomationPractice/";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	rdBTN(driver,url);
	}
	public static void rdBTN(WebDriver d,String url) {
		List<WebElement> list = d.findElements(By.cssSelector("input[type=\"radio\"]"));
		System.out.println(list.size());
		//System.out.println(list);
		for(WebElement elem:list) {
			System.out.println(elem.getTagName());
			System.out.println(elem.getText());
			System.out.println(elem.getAttribute("name"));

			
		}
		
	}
}
