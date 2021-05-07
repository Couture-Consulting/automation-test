package amx.demo.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	private Page() {}
	
	public static void openPage (String URL) {
		WebDriverManager.chromedriver().setup();
		WebDriver DRIVER = new ChromeDriver();
		DRIVER.get(URL);
	}
}
