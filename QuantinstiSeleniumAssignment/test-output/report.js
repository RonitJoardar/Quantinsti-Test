$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/quantinsti/features/quantra.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "##This file defines the Feature, Scenario and Test case under test"
    }
  ],
  "line": 2,
  "name": "Quantra login and site navigation",
  "description": "",
  "id": "quantra-login-and-site-navigation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To Validate Login and basic navigation of Quantra",
  "description": "",
  "id": "quantra-login-and-site-navigation;to-validate-login-and-basic-navigation-of-quantra",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on the Quantra landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user verifies the landing page title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the login icon",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user navigates to the login window and enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user selects profile from the profile dropdown icon",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user gets the email address text",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters incorrect \"\u003cmobilenumber\u003e\" and validates the error message",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user takes a screenshot of the profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user navigates to My Services Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user launches Quantra and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user user launches EPAT and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user navigates back to the main application",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user logs out and closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "quantra-login-and-site-navigation;to-validate-login-and-basic-navigation-of-quantra;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mobilenumber"
      ],
      "line": 23,
      "id": "quantra-login-and-site-navigation;to-validate-login-and-basic-navigation-of-quantra;;1"
    },
    {
      "cells": [
        "sachin.p+dummy1@quantinsti.com",
        "sachintest",
        "22222"
      ],
      "line": 24,
      "id": "quantra-login-and-site-navigation;to-validate-login-and-basic-navigation-of-quantra;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "To Validate Login and basic navigation of Quantra",
  "description": "",
  "id": "quantra-login-and-site-navigation;to-validate-login-and-basic-navigation-of-quantra;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on the Quantra landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user verifies the landing page title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the login icon",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user navigates to the login window and enters \"sachin.p+dummy1@quantinsti.com\" and \"sachintest\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user selects profile from the profile dropdown icon",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user gets the email address text",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters incorrect \"22222\" and validates the error message",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user takes a screenshot of the profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user navigates to My Services Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user launches Quantra and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user user launches EPAT and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user navigates back to the main application",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user logs out and closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_is_on_the_Quantra_landing_page()"
});
formatter.result({
  "duration": 6799457313,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_verifies_the_landing_page_title()"
});
formatter.result({
  "duration": 160027187,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_clicks_on_the_login_icon()"
});
formatter.result({
  "duration": 1286956048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sachin.p+dummy1@quantinsti.com",
      "offset": 47
    },
    {
      "val": "sachintest",
      "offset": 84
    }
  ],
  "location": "QuantraStepDefinitions.user_navigates_to_the_login_window_and_enters_and(String,String)"
});
formatter.result({
  "duration": 2451252197,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 86626963,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_selects_profile_from_the_profile_dropdown_icon()"
});
formatter.result({
  "duration": 2788658435,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_gets_the_email_address_text()"
});
formatter.result({
  "duration": 870717040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22222",
      "offset": 23
    }
  ],
  "location": "QuantraStepDefinitions.user_enters_incorrect_and_validates_the_error_message(String)"
});
formatter.result({
  "duration": 1386592443,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_takes_a_screenshot_of_the_profile_page()"
});
formatter.result({
  "duration": 526606651,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_navigates_to_My_Services_Page()"
});
formatter.result({
  "duration": 75039517,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_launches_Quantra_and_gets_the_page_title()"
});
formatter.result({
  "duration": 823950644,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_user_launches_EPAT_and_gets_the_page_title()"
});
formatter.result({
  "duration": 5689758379,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_navigates_back_to_the_main_application()"
});
formatter.result({
  "duration": 53627389,
  "status": "passed"
});
formatter.match({
  "location": "QuantraStepDefinitions.user_logs_out_and_closes_the_browser()"
});
formatter.result({
  "duration": 675997199,
  "status": "passed"
});
});