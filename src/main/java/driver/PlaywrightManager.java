package driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import browserfactory.BrowserFactory;

public class PlaywrightManager {
	
	private static final ThreadLocal<Playwright> playwrightThreadlocal = new ThreadLocal<>();
	private static final ThreadLocal<Browser> browserThreadlocal = new ThreadLocal<>();
	private static final ThreadLocal<BrowserContext> contextThreadlocal = new ThreadLocal<>();
	private static final ThreadLocal<Page> pageThreadlocal = new ThreadLocal<>();
	
	public static void initialize() {
		Playwright playwright = Playwright.create();
		Browser browser = BrowserFactory.createBrowser(playwright);
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		
		playwrightThreadlocal.set(playwright);
		browserThreadlocal.set(browser);
		contextThreadlocal.set(context);
		pageThreadlocal.set(page);
	}
	
	public static Playwright getPlaywright() {
		Playwright playwright = playwrightThreadlocal.get();
		if (playwright == null) {
			throw new IllegalStateException("playwright is not initialised for current thread");
		}
		return playwright;
	}
	
	public static Browser getBrowser() {
		Browser browser = browserThreadlocal.get();
		if (browser == null) {
			throw new IllegalStateException("browser is not initialised for current thread");
		}
		return browser;
	}
	
	public static BrowserContext getcontext() {
		BrowserContext context = contextThreadlocal.get();
		if (context == null) {
			throw new IllegalStateException("playwright is not initialise for current thread");
		}
		return context;
	}
	
	public static Page getPage() {
		Page page = pageThreadlocal.get();
		if (page == null) {
			throw new IllegalStateException("playwright is not initialise for current thread");
		}
		return page;
	}
	
	

}
