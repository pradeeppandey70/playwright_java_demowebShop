package tests;

import org.testng.annotations.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import base.BaseTest;
import pageobjects.Homepage;
import pageobjects.Loginpage;

public class Logintests extends BaseTest{
	@Test
	public void loginWithValidCredentials() {
		Homepage home = new Homepage(page);
		Loginpage login = home.clickLogin();
		login.enterUseremail("pradeeptest1@yopmail.com");
		login.enterPassword("Aa@12345");
		login.clickLoginBTN();
		assertThat(home.getuserEmail()).containsText("pradeeptest1@yopmail.com");
		
	}

}
