package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.components.ProductsMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class HomePage1 extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(id="navbarExample")
    private HeaderMenu headerMenu;

    @FindBy(className = "list-group")
    private List<ExtendedWebElement> ProductLinks;

    @FindBy(id = "tbodyid")
    private ProductsMenu productsMenu;

    public HomePage1(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public ProductsMenu getProductsMenu() {
        return productsMenu;
    }
}
