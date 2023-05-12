package com.cucumber.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.constants.WaitStrategy;
import com.cucumber.utilites.DriverUtilities;

public final class DemoPage extends DriverUtilities {

	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchBox;

	public DemoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public DemoPage sendTextInSearchBox(String searchText) {
		sendKeysAndEnter(searchBox, WaitStrategy.CLICKABLE, searchText);
		return this;
	}

}
