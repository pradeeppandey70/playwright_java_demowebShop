package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import base.BasePage;

public class Loginpage extends BasePage{
	
	protected Loginpage(Page page) {
		super(page);
		// TODO Auto-generated constructor stub
	}
	
	Locator pw = locator.label("login");
	
	
	public void clickLogin() {
		click(pw);
	}
	

}
