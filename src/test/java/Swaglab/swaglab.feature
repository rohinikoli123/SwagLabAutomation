@Reg1
Feature: Login scenarios.

Scenario: Swaglab login with valid credentioal
When user enter "standard_user" and "secret_sauce"
And user click on login button
Then user validate successfull login


Scenario: Swaglab login with valid Username and Invalid password
Swaglab login with valid credentioal
When user enter "standard_user" and "yuyuyt"
And user click on login button
Then user validate the error message


Scenario: Swaglab login with Invalid username and valid password
Swaglab login with valid credentioal
When user enter "tytyrtyr" and "secret_sauce"
And user click on login button
Then user validate The error message


Scenario: Swaglab login with Invalid username and Invalid password
Swaglab login with valid credentioal
When user enter "uytut" and "yutyuyt"
And user click on login button
Then user validate successfull login