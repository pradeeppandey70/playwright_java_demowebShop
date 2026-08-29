package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageobjects.Homepage;

public class Logintests extends BaseTest{
	@Test
	public void loginWithValidCredentials(String email, String password) {
		Homepage home = new Homepage(page);
	}

}
