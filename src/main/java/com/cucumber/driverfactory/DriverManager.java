package com.cucumber.driverfactory;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {

	}

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static synchronized void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

	public static void remove() {
		tlDriver.remove();
	}

}
