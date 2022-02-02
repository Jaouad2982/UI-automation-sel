import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
	public static void main(String[]args) {
	String title = "Rahul Shetty Academy";
	System.setProperty("webdriver.chrome.driver", "hiding the path to chromedriver");
	WebDriver driver = new ChromeDriver();
	// open a page
	driver.get("https://rahulshettyacademy.com/#/index");
	// getting the title of the page using getTitle
	System.out.println(driver.getTitle());
		
		
	}
}
