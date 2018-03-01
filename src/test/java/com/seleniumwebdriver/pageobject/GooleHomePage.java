package com.seleniumwebdriver.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("http://google.com")
public class GooleHomePage extends PageObject  {

    @FindBy(how = How.NAME, using = "q")
    private WebElementFacade searchBox;

    public void searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}