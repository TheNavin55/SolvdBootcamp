package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ProductInfoPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsMenu extends AbstractUIObject {

    @FindBy(xpath = "//*[@id='tbodyid']/div[1]")
    private List<ProductItem> products;

    public ProductsMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public ProductInfoPage selectProduct(String productName){
        for (ProductItem product : products) {
            if (product.readProduct().equalsIgnoreCase(productName)) {
                return product.openProductInfoPage();
            }
        }
        throw new RuntimeException("Unable to open product: " + productName);
    }
}
