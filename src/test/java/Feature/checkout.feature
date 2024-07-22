@Reg
Feature: Checkout Functionality

  Scenario: Verify checkout with valid first name, last name, and postal code
    Given user enters "standard_user" and "secret_sauce" details
    When user clicks on the login button
    And user clicks on the add to cart button
    Then validate cart count is "1"
    And user navigates to the checkout page
    And user enters the personal details "Test", "Automation", and "565466"
    And User click on continue btn
    Then validate user navigate to checkout two page