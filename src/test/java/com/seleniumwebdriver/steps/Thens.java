package com.seleniumwebdriver.steps;


import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;


public class Thens extends ScenarioSteps {


    @Then("^the search results are returned$")
    public void thenSearchResultsAreReturned() {
//        assertThat("Link is not displayed", steps.isSerenityOrgLinkDisplayed(), is(equalTo(true)));
    }
}
