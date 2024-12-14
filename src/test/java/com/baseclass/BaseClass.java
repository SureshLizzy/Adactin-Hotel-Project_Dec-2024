package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public void driverSetup(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			break;
		} 
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void elementSendKeys(WebElement element, String text) {
				element.sendKeys(text);
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}
	 
	public String getProjectFileValue(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(getProjectPath()+"\\Configuration\\config.properties");
		properties.load(inputStream);
		Object object = properties.get(key);
		String value = (String)object;
		System.out.println(value);
		return value;
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public WebElement findElementsByID(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public WebElement findElementsByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public WebElement findElementsByClassName(String className) {
		WebElement element = driver.findElement(By.name(className));
		return element;
	}
	
	public WebElement findElementsByXpath(String xpath) {
		WebElement element = driver.findElement(By.name(xpath));
		return element;
	}
	
	
	
	
}
