package com.cucumber.utilites;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.constants.Constants;
import com.cucumber.constants.WaitStrategy;
import com.cucumber.driverfactory.DriverManager;

public final class ExplicitWaitUtility {

	private ExplicitWaitUtility() {

	}

	public static WebElement performExplicitWaitUtility(WebElement element, WaitStrategy waitStrategy) {
		WebElement webElement = null;
		if (waitStrategy == WaitStrategy.VISIBLE) {
			webElement = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(Constants.getExplicitWait()))
					.until(ExpectedConditions.visibilityOf(element));
		} else if (waitStrategy == WaitStrategy.CLICKABLE) {
			webElement = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(Constants.getExplicitWait()))
					.until(ExpectedConditions.elementToBeClickable(element));
		}
		return webElement;
	}
}
