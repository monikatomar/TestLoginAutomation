$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("invalidLoginFeature.feature");
formatter.feature({
  "line": 2,
  "name": "UserInvalidLoginAuthentication",
  "description": "",
  "id": "userinvalidloginauthentication",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Check if user is unable to login after invalid credentials",
  "description": "",
  "id": "userinvalidloginauthentication;check-if-user-is-unable-to-login-after-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have launched the browser and entered the apotheke URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I input valid username and invalid password and click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see error message on same login page",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLoginStepDefinition.i_have_launched_the_browser_and_entered_the_apotheke_URL()"
});
formatter.result({
  "duration": 14055398300,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepDefinition.i_input_valid_username_and_invalid_password_and_click_on_Login_button()"
});
formatter.result({
  "duration": 23699079500,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepDefinition.i_should_see_error_message_on_same_login_page()"
});
formatter.result({
  "duration": 9264759500,
  "status": "passed"
});
formatter.uri("loginFeature.feature");
formatter.feature({
  "line": 2,
  "name": "UserValidLoginAuthentication",
  "description": "",
  "id": "uservalidloginauthentication",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Check if the user can login after valid credentials",
  "description": "",
  "id": "uservalidloginauthentication;check-if-the-user-can-login-after-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have launched the browser and entered the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I input valid username, password and click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the home page and validate with any of the button name on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.i_have_launched_the_browser_and_entered_the_URL()"
});
formatter.result({
  "duration": 13180802000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.i_input_valid_username_password_and_click_on_Login_button()"
});
formatter.result({
  "duration": 27759166400,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.i_should_see_the_home_page_and_validate_with_any_of_the_button_name_on_the_home_page()"
});
formatter.result({
  "duration": 7894659100,
  "status": "passed"
});
});