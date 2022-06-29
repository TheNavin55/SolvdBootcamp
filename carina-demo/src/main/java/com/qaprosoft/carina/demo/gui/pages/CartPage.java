package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class CartPage extends AbstractPage {

    public CartPage(WebDriver driver) {
        super(driver);
        setPageURL("/cart.html");
    }
}
