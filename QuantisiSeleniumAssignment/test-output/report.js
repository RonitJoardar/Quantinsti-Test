$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/quantinsti/features/quantra.feature");
formatter.feature({
  "name": "Quantra login and site navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To Validate Login and basic navigation of Quantra",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Quantra landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user verifies the landing page title",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on the login icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user navigates to the login window and enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects profile from the profile dropdown icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user gets the email address text",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters incorrect \"\u003cmobilenumber\u003e\" and validates the error message",
  "keyword": "Then "
});
formatter.step({
  "name": "user takes a screenshot of the profile page",
  "keyword": "Then "
});
formatter.step({
  "name": "user navigates to My Services Page",
  "keyword": "Then "
});
formatter.step({
  "name": "user launches Quantra and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "name": "user user launches EPAT and gets the page title",
  "keyword": "Then "
});
formatter.step({
  "name": "user navigates back to the main application",
  "keyword": "Then "
});
formatter.step({
  "name": "user logs out",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mobilenumber"
      ]
    },
    {
      "cells": [
        "sachin.p+dummy1@quantinsti.com",
        "sachintest",
        "22222"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Validate Login and basic navigation of Quantra",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Quantra landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_is_on_the_Quantra_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the landing page title",
  "keyword": "When "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_verifies_the_landing_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login icon",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_clicks_on_the_login_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the login window and enters \"sachin.p+dummy1@quantinsti.com\" and \"sachintest\"",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_navigates_to_the_login_window_and_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects profile from the profile dropdown icon",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_selects_profile_from_the_profile_dropdown_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the email address text",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_gets_the_email_address_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters incorrect \"22222\" and validates the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_enters_incorrect_and_validates_the_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user takes a screenshot of the profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_takes_a_screenshot_of_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to My Services Page",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_navigates_to_My_Services_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user launches Quantra and gets the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_launches_Quantra_and_gets_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user user launches EPAT and gets the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_user_launches_EPAT_and_gets_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates back to the main application",
  "keyword": "Then "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_navigates_back_to_the_main_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "QuantraStepDefinitions.user_logs_out()"
});
formatter.result({
  "status": "passed"
});
});