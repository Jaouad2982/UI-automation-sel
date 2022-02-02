import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
	public static void main(String[]args) {
	// this is from basics. 
	String title = "Rahul Shetty Academy";
	String url = "https://rahulshettyacademy.com/#/index";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	check(driver,url);
	}
	
	//lets add a method that does the work
public static void check(WebDriver driver,String url) {
	// open a page
	driver.get(url);
	// getting the title of the page using getTitle
	System.out.println(driver.getTitle());
	// clicking on the login btn, verifiying whether an error will be displayed. when entered the wrong info
	driver.findElement(By.className("register-btn")).click();
	// filling out the form and getting the error message displayed
	driver.findElement(By.id("email")).sendKeys("random@email.ramdom");
	driver.findElement(By.id("password")).sendKeys("psst");
	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	//
	System.out.println(driver.findElement(By.cssSelector(".bodySmall:nth-child(1)")).getText());
	}
}
