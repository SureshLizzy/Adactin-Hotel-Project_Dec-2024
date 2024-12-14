package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

public class SearchHotel_Pojo extends BaseClass {

	WebDriver driver;

	public SearchHotel_Pojo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement ddnLocation;
	
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	public WebElement getDdnRoomType() {
		return ddnLocation;
	}

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public void searchHotel() {
		Select s = new Select(getDdnLocation());
		s.selectByIndex(2);
		
		Select s2 = new Select(getDdnRoomType());
		s.selectByIndex(2);
	}

}
