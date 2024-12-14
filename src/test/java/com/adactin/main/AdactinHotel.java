package com.adactin.main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pojo.LoginPojo;
import com.pojo.LoginPojo_WithoutPageFactory;
import com.pojo.SearchHotel_Pojo;

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

		SearchHotel_Pojo searchHotel_Pojo = new SearchHotel_Pojo(driver);
		searchHotel_Pojo.searchHotel();
	}

}
