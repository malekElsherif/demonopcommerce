@smoke
Feature: D06_homeSlidersStepDef|user could click on home slider and direct user to other page
  Scenario: first slider is clickable on home page
    When user click on first slide
    Then  user could direct to nokia-lumia page

  Scenario: second slider is clickable on home page
    When user click on second slide
    Then  user could direct to iphone-6 page

