package tests;

import static org.junit.Assert.*;
//import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pageobjects.DynamicLoading;
import tests.groups.Deep;

@Category(Deep.class)

public class TestDynamicLoading extends Base{

	private DynamicLoading dynamicLoading;

	@Before
	public void setUp() {
		dynamicLoading = new DynamicLoading(driver);
	}

	@Test
	public void hiddenElementLoads(){
		dynamicLoading.loadExample("1");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		assertTrue("finish text didn't display after loading",
				dynamicLoading.finishTextPresent());
	}

	@Test
	public void elementAppears() {
		dynamicLoading.loadExample("2");
		assertTrue("finish text didn't render after loading",
				dynamicLoading.finishTextPresent());	
	}

}

