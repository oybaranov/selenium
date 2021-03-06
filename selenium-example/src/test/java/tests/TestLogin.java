package tests;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pageobjects.Login;
import tests.groups.Shallow;


public class TestLogin extends Base{
	private Login login;

	@Before
	public void setUp() {
		login = new Login(driver);
	}
	
	@Test
	@Category(Shallow.class)
	public void succeeded() {
		login.with("tomsmith", "SuperSecretPassword!");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		assertTrue("success message not present",
				login.successMessagePresent());
	}

	@Test
	@Category(Shallow.class)
	public void failed() {
		login.with("tomsmith", "bad passwor");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		assertTrue("failure message wasn't present after providing bogus credentials",
				login.failureMessagePresent());
		assertFalse("success message was present after providing bogus credentials",
				login.successMessagePresent());
	}

}