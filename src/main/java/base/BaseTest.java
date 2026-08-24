package base;

import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Page;

import driver.PlaywrightManager;
import utils.ConfigReader;

public abstract class BaseTest {
	
	protected Page page;
	
	@BeforeMethod
	public void setup() {
		PlaywrightManager.initialize();
		page = PlaywrightManager.getPage();
		page.navigate(ConfigReader.getConfig("url"));
	}
	
	
	

}
