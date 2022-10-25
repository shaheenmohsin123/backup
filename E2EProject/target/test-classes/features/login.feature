Feature: Login into application
Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login link in home page to land on secure sign in page
When User enters "Username" and "Password" and  logs in
Then Verify that user is successfully logged in

