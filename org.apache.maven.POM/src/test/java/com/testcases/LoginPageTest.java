package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginPageTest  extends BaseClass {
	
	public LoginPageTest() throws IOException {
		
		super();
	}
	LoginPage loginpage;
	@Test()
	public void test()
	{
		
		LoginPage.clickOnlogin();
		System.out.println("logged in");
	}


}
