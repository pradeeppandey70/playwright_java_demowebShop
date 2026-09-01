package factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import utils.ConfigReader;

public class BrowserFactory {
	
	private BrowserFactory() {
		
	}

	public static Browser createBrowser(Playwright playwright) {
		
		String browsername = System.getProperty("browsername");
		
		if(browsername == null || browsername.isEmpty()) {
			browsername = ConfigReader.getConfig("browsername");
		}
		
		BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000).setArgs(java.util.List.of("--start-maximized"));
		
		return switch(browsername.toLowerCase()) {
		case "chromium", "chrome", "edge"->
			playwright.chromium().launch(options);
		
		case "firefox"->
			playwright.firefox().launch(options);
			
		case "webkit"->
			playwright.webkit().launch(options);
			
		default->
			throw new IllegalArgumentException("unsupported browser type: " + browsername);
		};
		
	}

}
