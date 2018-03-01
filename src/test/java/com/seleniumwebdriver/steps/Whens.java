package com.seleniumwebdriver.steps;

import com.seleniumwebdriver.pageobject.GooleHomePage;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class Whens extends ScenarioSteps {

    GooleHomePage googleHomePage;



    @When("^I perform a search for something$")
    public void iSearchForSomething() {
        googleHomePage.searchFor("Selenium");
    }
}