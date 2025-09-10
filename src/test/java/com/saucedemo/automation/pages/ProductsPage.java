package com.saucedemo.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    public static final Target ADD_TO_CART_BUTTONS = Target.the("add to cart button").located(By.cssSelector(".btn_inventory"));
    public static final Target CART_ICON = Target.the("shopping cart icon").located(By.className("shopping_cart_link"));
}