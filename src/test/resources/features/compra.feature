Feature: Flujo de compra en Sauce Demo
  As a customer of Sauce Demo
  I want to be able to buy products
  So that I can get what I need

  Scenario: Compra exitosa de dos productos
    Given I am on the Sauce Demo login page
    When I log in with username "standard_user" and password "secret_sauce"
    And I add two products to the cart
    And I navigate to the cart
    And I complete the checkout form
    And I finalize the purchase
    Then I should see the confirmation message "Thank you for your order!"