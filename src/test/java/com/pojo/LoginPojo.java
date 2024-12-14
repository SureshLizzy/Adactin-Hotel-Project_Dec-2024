package com.pojo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPojo extends BaseClass {
	WebDriver driver;

	public LoginPojo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	 WebElement txtUser;
	@FindBy(id = "password")
	 WebElement txtPass;
	@FindBy(id = "login")
	 WebElement btnLogin;

	public void login() throws IOException {
		elementSendKeys(txtUser, getProjectFileValue("username"));
		elementSendKeys(txtPass, getProjectFileValue("password"));
		elementClick(btnLogin);
	}
	}
