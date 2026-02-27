@BagPackEx1
Feature: Buy the Backpack

  Scenario: User buys a backpack and completes the order
    Given browser is open
    When user is on the main Page
    And user enters the Username
    And user enters the Password
    And user clicks the login button
    Then user selects item
    Then user selects shopping Cart
    Then user selects Checkout
    And user enters First Name
    And user enters Last Name
    And user enters Post code
    And user clicks continue
    And user clicks Finish
