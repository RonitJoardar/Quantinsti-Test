Feature: Quantra login and site navigation

Scenario Outline: To Validate Login and basic navigation of Quantra

Given user is on the Quantra landing page
When user verifies the landing page title
Then user clicks on the login icon
Then user navigates to the login window and enters "<username>" and "<password>"
Then user clicks on login button
Then user selects profile from the profile dropdown icon
Then user gets the email address text
Then user enters incorrect "<mobilenumber>" and validates the error message
Then user takes a screenshot of the profile page
Then user navigates to My Services Page
Then user launches Quantra and gets the page title
Then user user launches EPAT and gets the page title
Then user navigates back to the main application
And user logs out
 

Examples:
|username|password|mobilenumber|
|sachin.p+dummy1@quantinsti.com|sachintest|22222|