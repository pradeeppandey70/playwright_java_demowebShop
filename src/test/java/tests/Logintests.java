package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageobjects.Homepage;
import pageobjects.Loginpage;

public class Logintests extends BaseTest{
	@Test
	public void loginWithValidCredentials(String email, String password) {
		Homepage home = new Homepage(page);
		Loginpage login = home.clickLogin();
		login.enterUseremail(email);
		login.enterPassword(password);
		login.clickLogin();
		
	}

}
