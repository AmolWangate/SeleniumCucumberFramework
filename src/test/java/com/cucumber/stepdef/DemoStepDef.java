package com.cucumber.stepdef;

import com.cucumber.manager.ContextManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {

	private ContextManager manager;

	public DemoStepDef(ContextManager manager) {
		this.manager = manager;
	}

	@Given("I launch google")
	public void iLaunchGoogle() {

	}

	@When("I enter {string} keyword")
	public void iEnterKeyword(String string) {
		manager.pageManager.getDemoPage().sendTextInSearchBox(string);
	}

	@Then("I am able to see result page")
	public void iAmAbleToSeeResultPage() {

	}

}
