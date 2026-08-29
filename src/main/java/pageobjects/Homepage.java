package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import base.BasePage;

public class Homepage extends BasePage{
	
	protected Homepage(Page page) {
		super(page);
		// TODO Auto-generated constructor stub
	}
	
	Locator pw = locator.label("login");
	
	
	public Loginpage clickLogin() {
		click(pw);
		return new Loginpage(page);
	}
	

}
