package com.cucumber.utilites;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cucumber.constants.WaitStrategy;

public class DriverUtilities {

	public void click(WebElement element, WaitStrategy waitStrategy) {
		ExplicitWaitUtility.performExplicitWaitUtility(element, waitStrategy).click();
	}

	public void sendKeys(WebElement element, WaitStrategy waitStrategy, String textToEnter) {
		WebElement webElement = ExplicitWaitUtility.performExplicitWaitUtility(element, waitStrategy);
		webElement.clear();
		webElement.sendKeys(textToEnter);
	}

	public void sendKeysAndEnter(WebElement element, WaitStrategy waitStrategy, String textToEnter) {
		WebElement webElement = ExplicitWaitUtility.performExplicitWaitUtility(element, waitStrategy);
		webElement.clear();
		webElement.sendKeys(textToEnter, Keys.ENTER);
	}

}
