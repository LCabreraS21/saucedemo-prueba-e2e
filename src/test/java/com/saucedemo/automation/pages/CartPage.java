package com.saucedemo.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").located(By.id("checkout"));
}