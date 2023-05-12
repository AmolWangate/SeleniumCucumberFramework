package com.cucumber.manager;

import org.openqa.selenium.WebDriver;
import com.cucumber.pompages.DemoPage;

public class PageObjectManager {

	WebDriver driver;
	private DemoPage demoPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public DemoPage getDemoPage() {
		if (demoPage == null) {
			demoPage = new DemoPage(driver);
		}
		return demoPage;
	}

}
