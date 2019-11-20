package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	   
	

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//div[@id='app']/div/nav/div/div/div/button")
	WebElement loginButton;
	
	@FindBy(id ="login-email")
	WebElement loginId;
	
	
	@FindBy(id ="login-password")
	WebElement password;
	
	
	@FindBy(xpath ="/html/body/div/main/div/div/div/div/form/div[5]/button")
	WebElement clickLogin;

	
	public static void clickOnlogin()
	{
		
		String x = driver.getCurrentUrl();
		System.out.println(x);
		//return x;
	}


	
}
