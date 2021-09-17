@tag
Feature: UserInvalidLoginAuthentication

  @Login
  Scenario: Check if user is unable to login after invalid credentials
    Given I have launched the browser and entered the apotheke URL
    When I input valid username and invalid password and click on Login button
    Then I should see error message on same login page
    