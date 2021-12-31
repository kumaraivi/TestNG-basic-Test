package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverInitializer {

	public static WebDriver driver;

	ConfigFileReader configFileReader = new ConfigFileReader();

	public WebDriver initiateDriver() {

		if (configFileReader.getBrowserName().equals("chrome")) {
			String path = System.getProperty("user.dir") + "\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);

			driver = new ChromeDriver();
			
		} else if (configFileReader.getBrowserName().equals("firefox")) {

			String path = System.getProperty("user.dir") + "\\BrowserDrivers\\geokodriver.exe";
			System.setProperty("webdriver.firefox.driver", path);
			
			driver=new FirefoxDriver();
			
		} else if (configFileReader.getBrowserName().equals("IE")) {

			String path = System.getProperty("user.dir") + "\\BrowserDrivers\\IEdriver.exe";
			System.setProperty("webdriver.ie.driver", path);
			
			driver=new InternetExplorerDriver();
		}
		return driver;

	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
