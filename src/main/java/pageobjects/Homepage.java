package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import base.BasePage;

public class Homepage extends BasePage{
	
	public Homepage(Page page) {
		super(page);
		// TODO Auto-generated constructor stub
	}
	
	private Locator loginLink = locator.text("Log in");
	private Locator userEmailDisplay = locator.css("a.account").first();
	
	public Loginpage clickLogin() {
		click(loginLink);
		return new Loginpage(page);
	}
	
	public Locator getuserEmail() {
		return this.userEmailDisplay;
	}
	
	
	
	

}
