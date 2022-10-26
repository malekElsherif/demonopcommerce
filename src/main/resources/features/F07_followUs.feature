@smoke
Feature: D07_followUsStepDef|user could create scenario for each button to make sure it works properly
  Scenario: user opens facebook link
    When user opens facebook link
    Then facebook is opened in new tab

  Scenario: user opens twitter link
    When user opens twitter link
    Then twitter is opened in new tab

  Scenario: user opens rss link
    When user opens rss link
    Then new-online-store is open is opened in new tab

  Scenario: user opens youtube link
    When user opens youtube link
    Then youtube is opened in new tab
