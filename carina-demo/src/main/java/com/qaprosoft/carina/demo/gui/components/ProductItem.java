package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ProductInfoPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductItem extends AbstractUIObject {

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4")
    private ExtendedWebElement productLabel;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private ExtendedWebElement productLink;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String readProduct() {
        return productLabel.getText();
    }

    public ProductInfoPage openProductInfoPage() {
        productLink.click();
        return new ProductInfoPage(driver);
    }
}
