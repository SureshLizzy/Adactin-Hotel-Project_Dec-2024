package com.pojo;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

public class LoginPojo_WithoutPageFactory extends BaseClass {
	WebDriver driver;

	public LoginPojo_WithoutPageFactory(WebDriver driver) {
		this.driver = driver;
	}

	By txtUser_loc = By.id("username");
	By txtPass_loc = By.id("password");
	By btnLogin_loc = By.id("login");

	public void login() throws IOException {
		elementSendKeys(driver.findElement(txtUser_loc), getProjectFileValue("username"));
		elementSendKeys(driver.findElement(txtPass_loc), getProjectFileValue("password"));
		elementClick(driver.findElement(btnLogin_loc));
	}
}
