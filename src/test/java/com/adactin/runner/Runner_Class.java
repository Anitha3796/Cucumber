package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Adactin.Base_Class;
import com.adactin.properties.fileReader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//cucuadactin//feature", glue = "com.adactin.Stepdefinition",
monochrome = true,
strict = true,
plugin = {"pretty","html:Reports/htmlreport.html","junit:Reports/xmlreport.xml",
		"json:Reports/jsonreport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/extendreport.html"
})

public class Runner_Class extends Base_Class {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		//driver = browserLaunch("chrome");
	String browser=fileReader_Manager.getInstanceCh().getInstanceCR().get_Browser();
	driver=Base_Class.browserLaunch(browser);
	}


	@AfterClass
	public static void tearDown() {
        close();

	}
}
