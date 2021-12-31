package com.banking.app.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.ConfigFileReader;
import utils.WebDriverInitializer;

public class TestClass  extends WebDriverInitializer{
	
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	
@Test
public void firstTest() {
	
	driver=initiateDriver();
	driver.get(configFileReader.getUrl());
	getDriver().close();
}

}
