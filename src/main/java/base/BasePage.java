package base;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public abstract class BasePage {
	
	protected final Page page;
	
	protected BasePage(Page page) {
		this.page = page;
	}
	
	public void navigate(String url) {
		page.navigate(url);
	}
	
	public String getTitle() {
		return page.title();
	}
	
	public String getUrl() {
		return page.url();
	}
	
	public void click(Locator locator) {
		locator.click();
	}
	
	public void fill(Locator locator, String text) {
		locator.fill(text);
	}
	
	public void clear(Locator locator) {
		locator.clear();
	}
	
	public void hover(Locator locator) {
		locator.hover();
	}
	
	public void doubleClick(Locator locator) {
		locator.dblclick();
	}
	
	public void check(Locator locator) {
		locator.check();
	}
	
	public void incheck(Locator locator) {
		locator.uncheck();
	}
	
	public void keypress(Locator locator,String key) {
		locator.press(key);
	}
	
	 

}
