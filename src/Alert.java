import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[]args) throws InterruptedException {
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		alert(driver,url);
		
	}
	public static void alert(WebDriver d,String url) {
		d.get(url);
		d.findElement(By.id("name")).sendKeys("anonymous");
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
	}
}

