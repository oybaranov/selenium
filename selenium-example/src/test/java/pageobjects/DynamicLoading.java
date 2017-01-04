package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading extends Base {
	By startButton = By.cssSelector("#start button");
	//By startButton = By.id("start");
	By finishText = By.id("finish");
	//By finishText = By.cssSelector("#finish");
	public DynamicLoading(WebDriver driver) {
		super(driver);
	}
	public void loadExample(String exampleNumber) {
		visit("/dynamic_loading/" + exampleNumber);
		click(startButton);
	}
	public Boolean finishTextPresent() {
		return waitForIsDisplayed(finishText, 10);
	}
}

