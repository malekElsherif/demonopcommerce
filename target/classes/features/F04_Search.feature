@smoke
  Feature: F04_Search| user could search for different products
    Scenario Outline: user could search using product name
      When user click on search field
      And user could search using "<productName>"
      Then user could found "<productName>" relative result
      Examples:
        | productName |
        | book |
        |  laptop|
        |  nike|


    Scenario Outline: user could search using sku
      When user click on search field
      And user could search using "<sku>"
      Then user could found "<sku>" inside product details page
      Examples:
        | sku |
        | SCI_FAITH |
        |  APPLE_CAM|
        |  SF_PRO_11|