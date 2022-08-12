package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControl {
	public static BrowserControl instance = null;
	public static WebDriver driver;
	
	public BrowserControl() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromeDriver//ChromeDriver.exe");
		driver = new ChromeDriver();
		maximizeBrowser();
	}
	
	public static BrowserControl getInstance() {
		if(instance == null) {
			instance = new BrowserControl();
		}
		return instance;
	}
	
	public void openPage(String URL) {
		driver.get(URL);
	}
	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void close() {
		if(instance == null) {
			driver.close();
			driver.quit();
			instance = null;
		}
	}
	
}