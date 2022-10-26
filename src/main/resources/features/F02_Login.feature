@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  When user go to login page
  And  user login with "valid" "mail@example.com" and "P@ssw0rd"
    Then user press on login button
  And user login to the system successfully


  Scenario: user could login with invalid email and password
  When user go to login page
  And  user login with "invalid" "wrong@example.com" and "P@ssw0rd"
    Then user press on login button
  And user could not login to the system