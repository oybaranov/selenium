package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Integra1 {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Development\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAa() throws Exception {
		driver.get("http://localhost//eseries/esr.elogin");
		driver.findElement(By.id("logon.username")).clear();
		driver.findElement(By.id("logon.username")).sendKeys("oleg");
		driver.findElement(By.id("logon.password")).clear();
		driver.findElement(By.id("logon.password")).sendKeys("Test1234");
		driver.findElement(By.cssSelector("button.go_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("banner_navigation_navigate")).click();
		driver.findElement(By.id("sid0001_esr_nav_ESR_NAV_PANE_FAVOURITES")).click();
		driver.findElement(By.id("nml1001_fav_link")).click();
		driver.findElement(By.id("controls_jvc_yn")).click();
		driver.findElement(By.cssSelector("option[value=\"Y\"]")).click();
		driver.findElement(By.id("retain_acc_bal_years")).clear();
		driver.findElement(By.id("retain_acc_bal_years")).sendKeys("12");
		driver.findElement(By.id("last_recon_year")).clear();
		driver.findElement(By.id("last_recon_year")).sendKeys("2012");
		driver.findElement(By.id("jvc_seq_yn")).click();
		
		
	
		
	    driver.findElement(By.cssSelector("span[name=\"sid0001_main_TABSTRIP_CONTAINER_1\"]")).click();

	  

//	    driver.findElement(By.id("multiple_apport")).click();    
//	    driver.findElement(By.id("apport_in_current")).click();
//	    driver.findElement(By.id("multiple_apport")).click(); 
//	    driver.findElement(By.cssSelector("div[name=\"sid0001_main_TABSTRIP_CONTAINER_0\"]")).click();
//	    driver.findElement(By.id("trx_narr_yn")).click();
//	    driver.findElement(By.id("control_span_desc_jvc_yn")).click();
//	    driver.findElement(By.id("trx_narr_yn")).click();
//	    driver.findElement(By.cssSelector("div[name=\"sid0001_main_TABSTRIP_CONTAINER_0\"]")).click();

		
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
}