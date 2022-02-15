import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {
	public static void main(String[]args) {
	String url = "https://www.amazon.com";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	click(driver,url);
	
}
	public static void click(WebDriver d,String url) {
		d.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).click();
		d.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("france");
		List<WebElement>elem = d.findElements(By.cssSelector("div[class=\"s-suggestion-container\"]"));
		for(int i = 0 ; i < elem.size();i++) {
			System.out.println(elem.get(i).getText());
		}
				
		// if text is equals to this or that. click on it
		for(WebElement i:elem) {
			if(i.getText().equalsIgnoreCase("france")) {
				//WebElenent of that option
				d.findElement(By.id("id of that element")).click();
			}
		}
	}
	

}