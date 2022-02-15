import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Intro {
	public static void main(String[] args) {
		// this is from basics.
		// this is not to desgin an automation framework but just to get practice,
		// frameworks will come later
		String title = "Rahul Shetty Academy";
//	String url = "https://rahulshettyacademy.com/AutomationPractice/";
//		String url = "https://rahulshettyacademy.com/angularpractice/";
		String url ="https://rahulshettyacademy.com/AutomationPractice/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
//		 check(driver,url);
//		 select(driver);
//		angularCheck(driver, url);

//	try {
//		autosuggest(driver,url);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
	alertCheck(driver,url);
	}
	
	// automating alerts 


	public static void angularCheck(WebDriver driver, String url) {
		driver.get(url);
		driver.findElement(By.name("name")).sendKeys("anonymous");
		driver.findElement(By.name("email")).sendKeys("anonymous@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("randompassword");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement el = driver.findElement(By.id("exampleFormControlSelect1"));
		el.click();
		Select s = new Select(el);
		s.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();

	}

	public static void autosuggest(WebDriver d, String url) throws InterruptedException {
		d.get(url);
		d.findElement(By.id("autocomplete")).sendKeys("fr");
		// getting the list of countries

		List<WebElement> ls = d.findElements(By.className("ui-menu-item-wrapper"));
		Thread.sleep(3000);
		System.out.println(ls);
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i).getText());
		}

	}

	public static void select(WebDriver d) {
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement elem = d.findElement(By.id("dropdown-class-example"));
		elem.click();
		Select s = new Select(elem);
		// by index
		s.selectByIndex(2);
		// we can also select by visible text or by value
	}

	// lets add a method that does the work
	public static void check(WebDriver driver, String url) {
		// open a page
		driver.get(url);
		// getting the title of the page using getTitle
		System.out.println(driver.getTitle());
		// clicking on the login btn, verifiying whether an error will be displayed.
		// when entered the wrong info
		driver.findElement(By.className("register-btn")).click();
		// filling out the form and getting the error message displayed
		driver.findElement(By.id("email")).sendKeys("random@email.ramdom");
		driver.findElement(By.id("password")).sendKeys("psst");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		//
		System.out.println(driver.findElement(By.cssSelector(".bodySmall:nth-child(1)")).getText());
	}
}
