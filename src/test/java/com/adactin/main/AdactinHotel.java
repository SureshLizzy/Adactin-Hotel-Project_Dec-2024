package com.adactin.main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pojo.LoginPojo;
import com.pojo.LoginPojo_WithoutPageFactory;

public class AdactinHotel extends BaseClass {

	

	@BeforeClass
	public void launchBrowser() throws IOException {
		driverSetup(getProjectFileValue("browser"));
		launchURL(getProjectFileValue("url"));
		maximizeWindow();
		implicitWait();
	}

	@Test
	public void loginProcess() throws IOException {
		
		LoginPojo loginPojo = new LoginPojo(driver);
		loginPojo.login();
//		LoginPojo_WithoutPageFactory loginPojo1 = new LoginPojo_WithoutPageFactory(driver);
//		loginPojo1.login();
	//	elementSendKeys(driver.findElement(By.id("username")), getProjectFileValue("username"));
	}

}
