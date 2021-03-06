package tests;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static tests.Config.*;

public class Base {
	protected WebDriver driver;
	@Rule
	public ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Development\\geckodriver-v0.11.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/vendor/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "/vendor/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}
		}

		@Override
		protected void after() {
			driver.quit();
		}
	};
}

