@smoke
  Feature: F03_currencies | user could testing currencies
    Scenario: user could Select Euro currency from the dropdown list on the top left of home page
      When user select euro currency from the dropdown list
      Then Euro Symbol  is shown on the  products displayed in Home page