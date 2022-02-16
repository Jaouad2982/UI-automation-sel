import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) {
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> ls = getLinks(driver);
		loopGetString(ls);
	}
	
	public static List<WebElement> getLinks(WebDriver d) {
		WebElement footer = d.findElement(By.className("gf-t"));
		List<WebElement> links = footer.findElements(By.cssSelector("table[class=\"gf-t\"] a"));
		return links;
	}
	
	
	public static void getWorkingCode(String url) throws MalformedURLException, IOException {
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int res = conn.getResponseCode();
	}
	public static void loopGetString(List<WebElement>st) {
		 for(int i = 0 ; i < st.size() ; i++) {
			String ur =  st.get(i).getText();
			try {
				getWorkingCode(ur);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
	}
}









