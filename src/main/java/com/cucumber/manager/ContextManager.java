package com.cucumber.manager;

import com.cucumber.driverfactory.DriverManager;

public class ContextManager {

	public PageObjectManager pageManager;

	public ContextManager() {
		pageManager = new PageObjectManager(DriverManager.getDriver());
	}
}
