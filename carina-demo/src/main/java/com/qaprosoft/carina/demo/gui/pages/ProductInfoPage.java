package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductInfoPage extends AbstractPage {

    @FindBy(className = "price-container")
    private ExtendedWebElement priceInfo;

    @FindBy(xpath = "//*[@id=\"more-information\"]")
    private ExtendedWebElement description;

    public ProductInfoPage(WebDriver driver) {
        super(driver);
    }

    public String readPrice() {
        assertElementPresent(priceInfo);
        return priceInfo.getText();
    }

    public String readDescription() {
        assertElementPresent(description);
        return description.getText();
    }
}
