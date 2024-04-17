Feature: Login Page feature
   @RegressionTest
  Scenario: Login page title
    Given user is on Login Page
    When user gets the title of the page
    Then page title should be "Login"
   
   @RegressionTest
  Scenario: Login with correct credentials 
    Given user is on Login Page
    When user enters username "SDET152"
    And 	user enters password "Team@004"
    And user clicks on the Login button
    Then user gets the title of the page  