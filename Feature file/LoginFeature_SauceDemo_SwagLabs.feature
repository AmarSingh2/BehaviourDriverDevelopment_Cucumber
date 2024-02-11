
Feature: Login of the Swag Labs
  
  Scenario: Successful Login with valid credential in Swag Labs WebPage
    Given User Launch Edge Browser
    When User open URL "https://www.saucedemo.com/v1/index.html"
    And User enters email as "standard_user" and password as "secret_sauce"
    Then Page title as "Swag Labs"
    When User click on logout button
    #Then Page title as "Swag Labs"
    And close browser

 