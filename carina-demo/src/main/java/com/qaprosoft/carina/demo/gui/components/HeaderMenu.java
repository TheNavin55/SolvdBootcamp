package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.CartPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage1;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(linkText = "Home ")
    private ExtendedWebElement homeLink;

    @FindBy(linkText = "Contact")
    private ExtendedWebElement contactLink;

    @FindBy(id="cartur")
    private ExtendedWebElement cartLink;


    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage1 openHomePage() {
        homeLink.click();
        return new HomePage1(driver);
    }

    public CartPage openCartPage() {
        cartLink.click();
        return new CartPage(driver);
    }
}
