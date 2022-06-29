package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.components.ProductsMenu;
import com.qaprosoft.carina.demo.gui.pages.CartPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage1;
import com.qaprosoft.carina.demo.gui.pages.ProductInfoPage;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "cristian")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testCartPage(){
        HomePage1 homePage = new HomePage1(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        HeaderMenu headerMenu = homePage.getHeaderMenu();
        Assert.assertTrue(headerMenu.isUIObjectPresent(2),"Header menu wasn't found!");
        CartPage cartPage = headerMenu.openCartPage();
    }

    @Test()
    @MethodOwner(owner = "cristian")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testProductSpecs() {
        HomePage1 homePage = new HomePage1(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage = new HomePage1(getDriver());
        ProductsMenu productsMenu = homePage.getProductsMenu();

        ProductInfoPage productInfoPage = productsMenu.selectProduct("Samsung galaxy s6");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productInfoPage.readDescription(),"Product description\n" +
                "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.");
        softAssert.assertEquals(productInfoPage.readPrice(),"$360 *includes tax","Invalid display info!");
        softAssert.assertAll();
    }

}
