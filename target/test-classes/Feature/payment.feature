Feature: Payment Functionality

@smoke
  Scenario: Verify payment functionality 
    Given user select payment option
    When user enter card details
    And user enter account number
    And user enter cvv number
    And user enter expiry date
    And user click on submit button
    Then validate the payment is successfull
    