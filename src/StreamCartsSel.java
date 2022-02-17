import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamCartsSel {
	public static void main(String[] args) {
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		getList(driver, url);
	}

	// get the list of vegetables in a table using stream and sort them
	public static void getList(WebDriver d, String url) {
		d.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> listOfElements = d.findElements(By.xpath("//tr/td[1]"));
		List<String> listElem = listOfElements.stream().map(s -> s.getText()).collect(Collectors.toList());
		listElem.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
		List<String> prices = listOfElements.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPrice(s))
				.collect(Collectors.toList());
	}

	private static String getPrice(WebElement s) {
		return s.findElement(By.xpath("following-sibling ::td[1]")).getText();
	}
}
