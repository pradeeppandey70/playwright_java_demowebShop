package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import base.BasePage;

public class Loginpage extends BasePage {

	protected Loginpage(Page page) {
		super(page);
		// TODO Auto-generated constructor stub
	}

	private Locator loginFormHeader = locator.text("Returning Customer");
	private Locator loginField = locator.label("Email:");
	private Locator passwordField = locator.label("Password:");
	private Locator rememberMeCheckbox = locator.label("Remember me?");
	private Locator forgotpasswordLink = locator.text("Forgot password?");
	private Locator loginBTN = locator.css("input.login-button");
	

	public void enterUseremail(String email) {
		fill(loginField, email);

	}

	public void enterPassword(String password) {
		fill(passwordField, password);
	}

	public Homepage clickLoginBTN() {
		click(loginBTN);
		return new Homepage(page);

	}

}
