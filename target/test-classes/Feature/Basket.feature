@Reg2
Feature:  basket functionality

Scenario: Verify the basket functionality
When user enter "standard_user" and "secret_sauce" details
And user click on login button
And user click on add to cart button
Then validate cart count is "1"
