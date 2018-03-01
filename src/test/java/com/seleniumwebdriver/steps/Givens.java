package com.seleniumwebdriver.steps;


import com.seleniumwebdriver.pageobject.GooleHomePage;
import cucumber.api.java.en.Given;
import net.thucydides.core.steps.ScenarioSteps;

public class Givens extends ScenarioSteps {

    GooleHomePage googleHomePage;

    @Given("^that I have launched a browser$")
    public void thatIHaveLaunchedABrowser() {
       googleHomePage.open();
    }
}
