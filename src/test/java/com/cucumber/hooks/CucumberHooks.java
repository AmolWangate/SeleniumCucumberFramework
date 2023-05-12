package com.cucumber.hooks;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.constants.Property;
import com.cucumber.driverfactory.Driver;
import com.cucumber.driverfactory.DriverManager;
import com.cucumber.utilites.ConfigLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks {

	private static final Logger LOG = LogManager.getLogger();

	@Before(order = 0)
	public void setUp(Scenario sc) {
		System.out.println("*********Starting Scenario***********: " + sc.getName());
		if (Objects.isNull(DriverManager.getDriver())) {
			String browserName = ConfigLoader.getInstance().getPropertyValue(Property.BROWSER);
			LOG.info("Browser Name: " + browserName);
			Driver.initializeDriver(Property.valueOf(browserName.toUpperCase()));
		}
	}

	@After(order = 0)
	public void tearDown(Scenario sc) {
		System.out.println("************Ending Scenario***********: " + sc.getName());
		if (Objects.nonNull(DriverManager.getDriver())) {
			LOG.info("Quitting browser");
			DriverManager.getDriver().quit();
			DriverManager.remove();
		}
	}

	@After(order = 1)
	public void captureScrrenshot(Scenario sc) {
		if (sc.isFailed()) {
			System.out.println("Getting screenshot for failed Scenario: " + sc.getName());
			byte[] src = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			sc.attach(src, "image/png", sc.getName());
		}
	}

}
