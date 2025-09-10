package com.saucedemo.automation.steps;

import com.saucedemo.automation.pages.CartPage;
import com.saucedemo.automation.pages.CheckoutPage;
import com.saucedemo.automation.pages.LoginPage;
import com.saucedemo.automation.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CompraSteps extends UIInteractionSteps {

    @Given("I am on the Sauce Demo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        openUrl("https://www.saucedemo.com/");
    }

    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String username, String password) {
        $(LoginPage.USERNAME_FIELD).type(username);
        $(LoginPage.PASSWORD_FIELD).type(password);
        $(LoginPage.LOGIN_BUTTON).click();
    }

    @And("I add two products to the cart")
    public void i_add_two_products_to_the_cart() {
        findAll(ProductsPage.ADD_TO_CART_BUTTONS).get(0).click();
        findAll(ProductsPage.ADD_TO_CART_BUTTONS).get(1).click();
    }

    @And("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        $(ProductsPage.CART_ICON).click();
    }

    @And("I complete the checkout form")
    public void i_complete_the_checkout_form() {
        $(CartPage.CHECKOUT_BUTTON).click();
        $(CheckoutPage.FIRST_NAME_FIELD).type("John");
        $(CheckoutPage.LAST_NAME_FIELD).type("Doe");
        $(CheckoutPage.ZIP_CODE_FIELD).type("12345");
        $(CheckoutPage.CONTINUE_BUTTON).click();
    }

    @And("I finalize the purchase")
    public void i_finalize_the_purchase() {
        $(CheckoutPage.FINISH_BUTTON).click();
    }

    @Then("I should see the confirmation message {string}")
    public void i_should_see_the_confirmation_message(String message) {
        assertThat($(CheckoutPage.CONFIRMATION_MESSAGE).getText()).isEqualTo(message);
    }
}