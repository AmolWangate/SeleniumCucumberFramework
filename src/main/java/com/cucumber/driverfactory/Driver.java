package com.cucumber.driverfactory;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.constants.Constants;
import com.cucumber.constants.Property;
import com.cucumber.utilites.ConfigLoader;

public final class Driver {

	private Driver() {
	}

	public static void initializeDriver(Property property) {
		switch (property) {
		case CHROME:
			DriverManager.setDriver(new ChromeDriver());
			break;
		case FIREFOX:
			DriverManager.setDriver(new FirefoxDriver());
			break;
		case EDGE:
			DriverManager.setDriver(new EdgeDriver());
			break;
		case SAFARI:
			DriverManager.setDriver(new FirefoxDriver());
			break;
		default:
			DriverManager.setDriver(new ChromeDriver());
			break;
		}
		DriverManager.getDriver().get(ConfigLoader.getInstance().getPropertyValue(Property.URL));
		DriverManager.getDriver().manage().deleteAllCookies();
		DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.getPageTimeout()));
		DriverManager.getDriver().manage().window().maximize();
	}

}
