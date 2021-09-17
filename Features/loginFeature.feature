@tag
Feature: UserValidLoginAuthentication

  @Login
  Scenario: Check if the user can login after valid credentials
    Given I have launched the browser and entered the URL
    When I input valid username, password and click on Login button
    Then I should see the home page and validate with any of the button name on the home page
    