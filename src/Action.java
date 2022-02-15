import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[]args) {
		String url = "https://www.amazon.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get(url);
		moveToElement(a,driver,url);
	}
	
	public static void moveToElement(Actions a,WebDriver d,String url) {
		a.moveToElement(d.findElement(By.id(""))).build().perform();
		// enter a text in capital  while holding the shift button
		Actions elem = a.moveToElement(d.findElement(By.id("")));
		elem.keyDown(Keys.SHIFT).sendKeys("random search");
		// select the entered text using double click
		elem.sendKeys("random text").doubleClick().build().perform();
		
	}
}
